//Wap to find the even index of the given array
class evenIndex{
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println("Index: " + i + " -> " + a[i]);
            }
        }
    }
}