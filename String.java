class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String cpdomain:cpdomains){
        String [] a=cpdomain.split(" ");
            int n=Integer.valueOf(a[0]);
        String [] b=a[1].split("\\.");
        for(int i=0;i<b.length;i++){
            String [] c =Arrays.copyOfRange(b,i,b.length);
            String subdomain= String.join(".",c);
            Integer oldcount=map.getOrDefault(subdomain,0);
            map.put(subdomain,oldcount+n);
             
        }
        }
            for(Map.Entry<String,Integer> e:map.entrySet()){
                String s=e.getKey();
                int m=e.getValue();
                String l=String.format("%d %s",m,s);
                list.add(l);
                
            }
            
         
        
        return list;
    }
    
    
        
}