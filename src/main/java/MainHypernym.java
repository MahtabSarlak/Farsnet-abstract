
import com.opencsv.CSVWriter;
import farsnet.schema.*;
import farsnet.service.SynsetService;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MainHypernym {
    private static String END_POINT = "http://farsnet.nlp.sbu.ac.ir/WebAPI/services/SenseService?WSDL";
    private static String USER_KEY = "d44b5403-3b91-11eb-8a1e-080027d731c1";

    public static boolean isAbstract(int synId){
        Synset synset_child = SynsetService.getSynsetById(synId);
//        System.out.println(synset_child.getSynsetRelations().size());
        for(SynsetRelation cr : synset_child.getSynsetRelations()){
            if (cr.getType().equals("Hypernym")) {

                if(cr.getSynsetWords2().contains("موجود انتزاعي")){
//                    System.out.println("abstract");
                    return true;
                }
                if(cr.getSynsetWords2().contains("موجود فيزيکي")){
//                    System.out.println("phy");
                    return false;
                }
                if(isAbstract(cr.getSynsetId2())){
                    return true;
                }
//                isAbstract(cr.getSynsetId2());
            }

        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("nouns.csv"));
        String row = "";

        List<String> mvs2 = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            mvs2.add(data[1]);
        }

        csvReader.close();
        System.out.println(mvs2);
        System.out.println(mvs2.size());
        List<List<Boolean>> mvs_abstract = new ArrayList<>();
        List<Map<Boolean, Long>> mvs_abstract_counts = new ArrayList<>();
        List<Long> num_synset_abs_mvs = new ArrayList<>();
        List<Long> num_synset_phy_mvs = new ArrayList<>();
        List<String[]> mvs_label = new ArrayList<>();
        try (CSVWriter writer = new CSVWriter(new FileWriter("abstract_nouns_mvs.csv"))) {

            int counter = 0;
            for (String mv : mvs2) {
                counter += 1;
                if(counter % 100 == 0){
                    System.out.println(counter);
                }
                if (!mv.equals("verb")) {
//                    mv = mv.split(" ")[0];
                    boolean isAbstractWord = false;
                    List<Boolean> mv_abstract = new ArrayList<>();
                System.out.println("this is MV " + mv+"*");
                    List<Synset> synset = SynsetService.getSynsetsByWord("EXACT", mv);
                    for (Synset s : synset) {
                        if (s.getPos().equals("Noun")) {
//                if (s.getPos().equals("Noun") && s.getSemanticCategory().equals("ACT")) {
                            for (SynsetRelation t : s.getSynsetRelations()) {
                                if (t.getType().equals("Hypernym")) {

//                            System.out.println(t.getSynsetWords1());
//                            System.out.println(t.getSynsetWords2());
//                            System.out.println(t.getSynsetId2());
//                            System.out.println(t.getType());
                                    boolean isabs = isAbstract(t.getSynsetId2());
//                            System.out.println(isabs);
                                    if (isabs) {
//                                System.out.println("abstract");
                                        isAbstractWord = true;
                                        mv_abstract.add(true);
                                    } else {
                                        mv_abstract.add(false);
                                    }
                                }

                            }
                        }
                    }
                    mvs_abstract.add(mv_abstract);
                    Map<Boolean, Long> counts = mv_abstract.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
                System.out.println(counts.get(true));
                    if (!counts.isEmpty()) {
//                        num_synset_abs_mvs.add(counts.getOrDefault(Boolean.TRUE, (long) 0));
//                        num_synset_phy_mvs.add(counts.getOrDefault(Boolean.FALSE, (long) 0));
                        long abs_v = counts.getOrDefault(Boolean.TRUE, (long) 0);
                        long phy_v = counts.getOrDefault(Boolean.FALSE, (long) 0);
                        mvs_label.add(new String[]{abs_v + " " + phy_v});
//                        mvs_label.add(abs_v > phy_v ? "abstract" : phy_v > abs_v ? "physical" : "both");
                    } else {
                        mvs_label.add(new String[]{"None"});
                    }
//                    mvs_abstract_counts.add(counts);
//            if(isAbstractWord){
//                System.out.println("abstract");
//            }else{
//                System.out.println("physical");
//            }
                }
            }
//            System.out.println(mvs_abstract);
//            System.out.println(mvs_abstract_counts);
//            System.out.println(num_synset_abs_mvs);
//            System.out.println(num_synset_phy_mvs);
//            System.out.println(mvs_label);
//            String collect = mvs_label.stream().collect(Collectors.joining(","));
//            System.out.println(collect);

//            writer.writeAll(mvs_label);
            writer.writeAll(mvs_label);
//            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
