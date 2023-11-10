class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans= new ArrayList<>();
       List<Integer>lis1=new ArrayList<>();
       lis1.add(1);
       List<Integer>lis2=new ArrayList<>();
       lis2.add(1);
       lis2.add(1);

       if(numRows==1){
           ans.add(lis1);
           return ans;
       }else if (numRows==2){
           ans.add(lis1);
           ans.add(lis2);
           return ans;
       }
       numRows=numRows-2;
       ans.add(lis1);
       ans.add(lis2);
       List<Integer> temp=new ArrayList<>(lis2);


       while(numRows>0){
           List<Integer> newarray=new ArrayList<>();
           newarray.add(1);
           for(int i=0;i<(temp.size())-1;i++){
               newarray.add(temp.get(i)+temp.get(i+1));
           }
           newarray.add(1);
           ans.add(newarray);
           temp.clear();
           temp.addAll(newarray);
           numRows--;
       }
       return ans;

    }

       
}
