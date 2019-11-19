public class Loops {
    public static void main(String [] args){
        System.out.println("---------");
        for(int i=0;i<10;i++){
            System.out.println("Loop 1:"+i);
        }
        System.out.println("---------");
        int [] arr={10,20,30};
        for (int item:arr){
            System.out.println("Loop 2:"+item);
        }
        System.out.println("---------");
        int j=0;
        while(j<10){
            System.out.println("Loop 3:"+j);
            j++;

        }
        System.out.println("---------");
    }
}
