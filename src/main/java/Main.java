import webservice.Sense;
import webservice.SenseServiceProxy;

import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) {
        SenseServiceProxy proxy = new SenseServiceProxy();
        proxy.setEndpoint("http://farsnet.nlp.sbu.ac.ir/WebAPI/services/SenseService?WSDL");
        try{
            Sense[] senses= proxy.getSensesByWord("d44b5403-3b91-11eb-8a1e-080027d731c1", "LIKE", "جمهوري اسلامي ايران");
            for (Sense sense :
                    senses) {
                String tmp = sense.getWord().getDefaultValue();
                System.out.println(tmp);
            }
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
