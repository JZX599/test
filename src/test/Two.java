package test;

public class Two {

    public static void main(String[] args) {





        new Thread(()->{

            Three three=Three.getInstance();
            System.out.println(three);
        }).start();
        new Thread(()->{

            Three three=Three.getInstance();
            System.out.println(three);
        }).start();
    }


}

class Three{


    public  static Three three ;
    private Three(){

    }


    public synchronized static Three getInstance(){

        if (three==null){
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
            three = new Three();

        }
        return three;
    }

}