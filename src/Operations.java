public class Operations {
    public static void main(String [] args){
        int i=10;
        ++i;
        System.out.println("Pre Increment:"+i);
        int j=10;
        j++;
        System.out.println("Post Increment:"+j);

        if(i%2==0){
            System.out.println("Is Even");
        }else{
            System.out.println("Is Odd");
        }
    }
}
