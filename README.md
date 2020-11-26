- scanner的默认分割符是空格，即碰到空格停止当前的读取。  
- 和GitHub连接要点击commit and push  
- 保留两位小数使用string的format方法，即如下。
```
//temp是double值
String.format("%.2f",temp)
```
- java的二维数组排序  
int[][] temp=new int[3][2];
```
Arrays.sort(temp,new Comparator<int[]>(){
    @Override
    public int compare(int[] a,int[] b){
        if(a[0]==b[0])return a[1]-b[1];
        else return a[0]-b[0];
    }
})
```
