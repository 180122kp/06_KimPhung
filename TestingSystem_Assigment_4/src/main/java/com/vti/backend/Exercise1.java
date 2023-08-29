package com.vti.backend;
import com.vti.entity.Account;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Department;
public class Exercise1 {


        public static void question1(Account account)
        {
            if (account.getDepartment().getId() == 0 )
            {
                System.out.println("Nhân viên này chưa có phòng ban");
            }
            else System.out.println("Phòng ban của nhân viên này là " + account.getDepartment().getName());

        }
        public int countGroupsForAccount(Account account)
        {
            Group[] groups = account.getGroups();
            return groups.length;
        }
        public void question2(Account account)
        {
            if(countGroupsForAccount(account) == 0)
            {
                System.out.println("Nhân viên này chưa có group");
            }
            else if (countGroupsForAccount(account) >= 1 || countGroupsForAccount(account) <= 2)
            {
                System.out.println("Group của nhân viên này là Deverloper và Designer " );
            }
            else if (countGroupsForAccount(account) == 3)
            {
                System.out.println("Nhân viên này là người quan trọng,tham gia nhiều group");
            }
            else if (countGroupsForAccount(account) >= 4)
            {
                System.out.println("nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }
        public void question3(Account account)
        {
            System.out.println(account.getDepartment().getId() == 0 ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account.getDepartment().getName());
        }
        public void question4(Account account)
        {
            System.out.println(account.getPosition().getName() == "Developer" ? "Đây là Developer" : "Người này không phải là Developer");
        }

        public int countAccountForGroup(Group group)
        {
            Account[] accounts = group.getAccounts();
            return accounts.length;
        }
        public void question5(Group group)
        {
            switch (countAccountForGroup(group))
            {
                case 1 : System.out.println("Nhóm có 1 thành viên"); break;
                case 2 : System.out.println("Nhóm có 2 thành viên"); break;
                case 3 : System.out.println("Nhóm có 3 thành viên"); break;
                default: System.out.println("Nhóm có nhiều thành viên"); break;
            }
        }
        public void question6(Account account)
        {
            switch (countGroupsForAccount(account)) {
                case 0:
                    System.out.println("Nhân viên này chưa có group");
                    break;
                case 1: case 2:
                    System.out.println("Group của nhân viên này là Deverloper và Designer ");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng,tham gia nhiều group");
                    break;
                default:
                    System.out.println("nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
        public void question7(Account account)
        {
            switch (account.getPosition().getName())
            {
                case "Developer": System.out.println("Đây là Developer"); break;
                default: System.out.print("Người này không phải Developer");
            }
        }
        public void question8(Account account)
        {
            System.out.println("Account: " + account.getId() + "\nFullName: "+ account.getFullname() + "\nEmail: " + account.getEmail() + "\nPhòng ban: " + account.getDepartment().getName());
        }
        public void question9(Department department)
        {
            System.out.println("ID: " + department.getId() + " Tên phòng ban: " + department.getName());
        }
        public void question10(Account[] account)
        {
            for (Account account1 : account)
            {
                System.out.println("Account: " + account1.getId() + "\nFullName: "+ account1.getFullname() + "\nEmail: " + account1.getEmail() + "\nPhòng ban: " + account1.getDepartment().getName());
            }
        }
        public void question11(Department[] departments)
        {
            for(Department department : departments)
            {
                for (int i = department.getId(); i <= 2; i++)
                {
                    System.out.println("ID: " + department.getId() + "\nTên phòng ban: " + department.getName());
                }
            }
        }
        public void question13(Account[] account)
        {
            for (Account account1 : account)
            {
                if(account1.getId() == 2)
                {
                    continue;
                }
                System.out.println("Account: " + account1.getId() + "\nFullName: "+ account1.getFullname() + "\nEmail: " + account1.getEmail() + "\nPhòng ban: " + account1.getDepartment().getName());
            }
        }
        public void question14(Account[] account)
        {
            for(Account account1 : account)
            {
                for(int i = account1.getId(); i < 4; i++)
                {
                    System.out.println("Account: " + account1.getId() + "\nFullName: "+ account1.getFullname() + "\nEmail: " + account1.getEmail() + "\nPhòng ban: " + account1.getDepartment().getName());
                }
            }
        }
        public void question15()
        {

            for(int i = 2; i < 20; i += 2)
            {
                System.out.println(i);
            }
        }
    }


