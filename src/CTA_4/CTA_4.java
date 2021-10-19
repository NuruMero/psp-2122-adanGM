package CTA_4;

public class CTA_4 {

    public static void main(String[] args) {

        int exit=-1;
        if(args.length < 1) {
            exit=1;
        }else if(args[0].matches("[+-]?\d(\.\d+)?")==true){
            int num=Integer.parseInt(args[0]);
            if(num<0) {
                exit=3;
            }
        }else if(args[0].matches("[+-]?\d(\.\d+)?")==false) {
            exit=2;
        }else {
            exit=0;
        }

        System.exit(exit);
    }
}
