
import com.opencsv.CSVWriter;
import farsnet.schema.*;
import farsnet.service.*;
import farsnet.service.SynsetService;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;

public class Main {
    private static String END_POINT = "http://farsnet.nlp.sbu.ac.ir/WebAPI/services/SenseService?WSDL";
    private static String USER_KEY = "d44b5403-3b91-11eb-8a1e-080027d731c1";

    public static void main(String[] args) throws IOException {
        Map<String,List<String>> result = new HashMap<>();
        List<String[]> allsim = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader("all_bijan_masdars.csv"));
        String row = "";

        List<String> mvs = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[]  data = row.split(",");
            mvs.add(data[1]);
        }

        csvReader.close();


        System.out.println(mvs.size());
        try (CSVWriter writer = new CSVWriter(new FileWriter("bijan noun all.csv"))) {
            int counter = 0;
            List<String> mvs2 = new ArrayList<>();
            mvs2.add("نگاه");
//            mvs2.add("چشم");
            for (String mv : mvs2){
                System.out.println("this is MV "+mv);
                List<Synset> synset = SynsetService.getSynsetsByWord("EXACT",mv);
//                System.out.println("this is synset " + synset);
//                Set<String> similarVerbs = new HashSet<>();
                for(Synset s : synset){
//                    if (s.getPos().equals("Noun")) {
                    for(SynsetRelation t : s.getSynsetRelations())
                    {
                        if(t.getType().equals("Hypernym")){
                            System.out.println(t.getSynsetWords1());
                            System.out.println(t.getSynsetWords2());
                            System.out.println(t.getType());
                            System.out.println("&&&&&&&&&&&&&&&&&&&&");
                        }

                    }
//                    System.out.println(s.getWordNetSynsets().toString());
//                        for (Sense t : s.getSenses()) {
//                            System.out.println(t.getWord().getDefaultValue());
////                            System.out.println(t.getNounCategory());
//                        }
//                            if(t.getWord().getDefaultValue().split(" ").length == 1){
//                                similarVerbs.add(t.getWord().getDefaultValue());
//                            }
//
//                        }
                    }

//                if (similarVerbs.size() >0){
//                    System.out.println(similarVerbs.toString() + counter);
//                }
//                counter += 1;
//                java.lang.String sim = similarVerbs.toString();
//                allsim.add(new String[]{mv, sim});
            }
//            System.out.println("inja");
//            writer.writeAll(allsim);
//            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
