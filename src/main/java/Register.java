/**
 * Project name(项目名称)：Character类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Register
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/1
 * Time(创建时间)： 22:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Register
{
    public static boolean validateUser(String username, String userPassWord, String age)
    {
        boolean conUname = false;       // 用户名是否符合要求
        boolean conPwd = false;    // 密码是否符合要求
        boolean conAge = false;    // 年龄是否符合要求
        boolean con = false;    // 验证是否通过
        if (username.length() > 0)
        {
            for (int i = 0; i < username.length(); i++)
            {
                // 验证用户名是否全部为字母，不能含有空格
                if (Character.isLetter(username.charAt(i)))
                {
                    conUname = true;
                }
                else
                {
                    conUname = false;
                    System.out.println("用户名只能由字母组成，且不能含有空格！");
                    break;
                }
            }
        }
        else
        {
            System.out.println("用户名不能为空！");
        }
        if (userPassWord.length() > 0)
        {
            for (int j = 0; j < userPassWord.length(); j++)
            {
                // 验证密码是否由数字和字母组成，不能含有空格
                if (Character.isLetterOrDigit(userPassWord.charAt(j)))
                {
                    conPwd = true;
                }
                else
                {
                    conPwd = false;
                    System.out.println("密码只能由数字或字母组成！");
                    break;
                }
            }
        }
        else
        {
            System.out.println("密码不能为空！");
        }
        if (age.length() > 0)
        {
            for (int k = 0; k < age.length(); k++)
            {
                // 验证年龄是否由数字组成
                if (Character.isDigit(age.charAt(k)))
                {
                    conAge = true;
                }
                else
                {
                    conAge = false;
                    System.out.println("年龄输入有误!");
                    break;
                }
            }
            if (conAge)
            {
                int theAge = Integer.parseInt(age);
                if (theAge >= 100)
                {
                    System.out.println("输入的年龄太大！");
                    conAge = false;
                }
                if (theAge <= 0)
                {
                    System.out.println("输入的年龄太小！");
                    conAge = false;
                }
            }
        }
        else
        {
            System.out.println("年龄必须输入！");
        }
        if (conUname && conPwd && conAge)
        {
            con = true;
        }
        else
        {
            con = false;
        }
        return con;
    }
}
