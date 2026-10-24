class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:hm.values()){
            System.out.println(n);
        }
        List<Map.Entry<Integer,Integer>> al=new ArrayList<>(hm.entrySet());
        al.sort((a, b) ->
            Integer.compare(b.getValue(), a.getValue())
        );
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=al.get(i).getKey();
        }

        return res;
    }
}
