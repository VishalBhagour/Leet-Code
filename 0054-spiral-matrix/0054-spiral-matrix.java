class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> l=new ArrayList<>();
        int minr=0;int maxr=arr.length-1;
        int minc=0;int maxc=arr[0].length-1;

while(minc<=maxc && minr<=maxr){
        for(int j=minc;j<=maxc;j++){
            l.add(arr[minr][j]);
        }
        minr++;

        if(minc>maxc || minr>maxr)break;

        for(int i=minr;i<=maxr;i++){
            l.add(arr[i][maxc]);
        }
        maxc--;

if(minc>maxc || minr>maxr)break;
        for(int j=maxc;j>=minc;j--){
            l.add(arr[maxr][j]);
        }
        maxr--;

if(minc>maxc || minr>maxr)break;
        for(int i=maxr;i>=minr;i--){
            l.add(arr[i][minc]);
        }
        minc++;

}
return l;
    }
}