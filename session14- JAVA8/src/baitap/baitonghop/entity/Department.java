package baitap.baitonghop.entity;

import baitap.baitonghop.config.InputMethods;
import baitap.baitonghop.implement.DepartmentImpl;
import baitap.baitonghop.implement.EmployeeImpl;

public class Department
{
    private String departmentId, departmentName;
    private int totalMembers;

    public void displayData()
    {   //Lấy ra số lượng nhân viên từ thông tin tên phòng ban tương ứng
        totalMembers = EmployeeImpl.departmentMember.get(this.departmentName);
        System.out.println("Mã phòng ban: " + this.departmentId);
        System.out.println("Tên phòng ban: " + this.departmentName);
        System.out.println("Số nhân viên trong phòng ban: " + this.totalMembers);
    }

    public void inputData()
    {
        while (true)
        {
            System.out.println("Mời nhập mã phòng ban, bắt đầu bằng D và có 4 ký tự");
            String input = InputMethods.getString();
            if (!input.startsWith("D") || input.length() != 4)
            {
                System.out.println("Vui lòng nhập đúng định dạng");
                break;
            } else this.departmentId = input;
        }
        outer:
        while (true)
        {
            System.out.println("Mời nhập tên phòng ban");
            this.departmentName = InputMethods.getString();
            for (int i = 0; i < DepartmentImpl.departmentList.size(); i++)
            {
                if (departmentName.equals(DepartmentImpl.departmentList.get(i).departmentName))
                {
                    System.out.println("Tên này đã tồn tại, vui lòng nhập tên khác");
                } else break outer;
            }
        }

    }

    public Department()
    {
    }

    public String getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(String departmentId)
    {
        this.departmentId = departmentId;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public int getTotalMembers()
    {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers)
    {
        this.totalMembers = totalMembers;
    }
}
