package java_basic.Serializable;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        try {
            // create a file out put stream , specifies the path to the file write to
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            // 创建一个对象输出流，关联到文件输出流，用于将对象序列化输出
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // 将person对象序列化并写入到文件中
            out.writeObject(person);
            // 关闭流，释放资源
            out.close();
            fileOut.close();
            System.out.println("Person对象已序列化并保存到 person.ser 文件中。");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            // 创建文件输入流，指定要读取的序列化文件路径
            FileInputStream fileIn = new FileInputStream("person.ser");
            // 创建对象输入流，关联到文件输入流，用于读取字节流并反序列化对象
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // 从文件中反序列化出Person对象
            Person person1 = (Person) in.readObject();
            // close stream release resource
            in.close();
            fileIn.close();
            System.out.println("从文件中反序列化得到的Person对象：");
            System.out.println("名字: " + person1.getName());
            System.out.println("年龄: " + person1.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        File file = new File("person.ser");
        if(file.exists()){
            if(file.delete()){
                System.out.println("file delete successfully");
            }else{
                System.out.println("file delete failed");
            }
        }else{
            System.out.println("file not exists");
        }
    }
}
