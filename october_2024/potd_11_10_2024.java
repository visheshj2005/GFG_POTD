class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        int len=arr.size(),temp,a;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<len;i++){
            list.add(-1);
        }
        for(int i=0;i<len;i++){
            temp=arr.get(i);
            if(temp!=-1){
                list.set(temp,temp);
            }
        }
        return list;
    }
}
