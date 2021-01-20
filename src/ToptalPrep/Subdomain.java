package ToptalPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Subdomain {
    public static void main(String[] args) {
        Subdomain domain =new Subdomain();
        domain.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    }
    HashMap<String, Integer> ans = new HashMap<>();


    public List<String> subdomainVisits(String[] cpdomains) {
        for(String domain: cpdomains){
            getSubDomains(domain);
        }

        List<String> ansList = new ArrayList<>();;

        for (String key: ans.keySet()){
            ansList.add(ans.get(key) + " "+ key);
        }

        return ansList;
    }


    private void getSubDomains(String domain){
        String [] words = domain.split(" ");
        String count = words[0];

        String [] subDomains = words[1].split("\\.");
        StringBuilder subDomain = new StringBuilder();

        for(int i=subDomains.length-1; i>0; i--){

            StringBuilder nextSb = new StringBuilder();

            if (subDomain.length() > 0) {
                nextSb.append(".");
            }

            nextSb.insert(0, subDomains[i]);
            subDomain.insert(0 ,nextSb);

            int c = Integer.parseInt(count);
            ans.put(subDomain.toString(),  ans.getOrDefault(subDomain.toString(), 0)+c);
        }
    }
}
