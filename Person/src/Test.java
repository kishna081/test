
public class Test {

	public static void main(String[] args) {
Person taro = new Person();

taro.name = "山田太郎";
taro.age = 20;
taro.phoneNumber = "111-1111-1111";
taro.addess = "東京都";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.addess);
taro.talk();
taro.walk();
taro.run();

System.out.println();

Person jiro = new Person();
jiro.name = "木村次郎";
jiro.age = 18;
jiro.phoneNumber = "222-2222-2222";
jiro.addess = "神奈川県";

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.addess);
jiro.talk();
jiro.walk();
jiro.run();

System.out.println();

Person hanako = new Person();
hanako.name = "鈴木花子";
hanako.age =16;
hanako.phoneNumber = "333-3333-3333";
hanako.addess = "埼玉県";

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.addess);
hanako.talk();
hanako.walk();
hanako.run();

System.out.println();

Person kana = new Person();
kana.name = "岸かな";
kana.age = 24;
kana.phoneNumber = "444-4444-4444";
kana.addess = "千葉県";

System.out.println(kana.name);
System.out.println(kana.age);
System.out.println(kana.phoneNumber);
System.out.println(kana.addess);
kana.talk();
kana.walk();
kana.run();

System.out.println();

Robot aibo = new Robot();
aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();
System.out.println();


Robot asimo = new Robot();
asimo.name="asimo";
asimo.talk();
asimo.walk();
asimo.run();
System.out.println();

Robot pepper = new Robot();
pepper.name="pepper";
pepper.talk();
pepper.walk();
pepper.run();
System.out.println();
	}
}
