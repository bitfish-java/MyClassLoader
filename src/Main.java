public class Main {
    public static void main(String[] args) throws Exception{
        MyClassLoader mcl = new MyClassLoader();

        // 指定mcl为类加载器
        Class<?> clazz = Class.forName("People", true, mcl);

        Object obj = clazz.newInstance();
        System.out.println(obj);

        // 因为双亲委派机制，最终的加载器还是jdk自带的这个
        System.out.println(obj.getClass().getClassLoader());
        //jdk.internal.loader.ClassLoaders$AppClassLoader@4459eb14
    }
}
