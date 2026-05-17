class Solution {
    public List<Integer>  findRow(int row){
        long ans = 1;
        List<Integer> li = new ArrayList<>();
        li.add(1);
        for(int i=1;i<row;i++){
            ans *= (row-i) ;
            ans/=i;
            li.add((int)ans);
        }
        return li;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            list.add(findRow(i));
        } 
        return list;
    }
}