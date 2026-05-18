// Humanクラスを書く
public class Human{
    //privateにする
    private String name;
    private int height;
    private int weight;
///コンストラクタ
    Human(String name,int height,int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
//情報取得
    String getname(){
        return name;
    }
    int getheight(){
        return height;
    }
    int getweight(){
        return weight;
    }
    
//表示方法
void putSpec(){
        System.out.println("名前："+name);
        System.out.println("身長："+height);
        System.out.println("体重："+weight);
    }
}