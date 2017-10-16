
public class Binary {

    int gussedNo;
    public static   int count =0;

     void search(int lowerBound,int upperBound,int num){
        gussedNo=upperBound+lowerBound/2;
        count();
        if(gussedNo==num){
            System.out.println(count);}
            else if(gussedNo>num){

                upperBound=gussedNo-1;

                search(lowerBound,upperBound,num);

                }
            if(gussedNo<num){

                lowerBound=gussedNo+1;
                search(lowerBound,upperBound,num);




        }

        }
    int count(){
        count=count+1;
        return count;
    }

}
