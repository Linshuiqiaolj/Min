package json;

/**
 * 
 * @���� ��ˮ�� 2017��12��4������7:54:27
 */
public class Tld_util {
    public static boolean isnull(String namew,String passWord){  
        String value = "linshuiqiaolj";
        String passw = "5209";
        System.out.println("name:" + namew + "pass:" + passWord);  
        if(namew!=null && namew.equals(value) && passWord!=null && passWord.equals(passw)){  
            return true;
        }
        return false;         
    }
}
