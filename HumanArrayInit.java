// mainメソッドを含むHumanArrayInitクラスを書く
class HumanArrayInit{
    public static void main(String [] args){
        //初期化
        Human[] a={
            new Human("葉",160,50),
            new Human("家",170,60),
            };
        //代入
        Human[] b=new Human[2];
        b=new Human[]{new Human("葉",165,55),
        new Human("家",175,65)
        };

        //表示
        System.out.println("初期化");
        a[0].putSpec();
        a[1].putSpec();
        System.out.println("代入");
        b[0].putSpec();
        b[1].putSpec();
    }
}