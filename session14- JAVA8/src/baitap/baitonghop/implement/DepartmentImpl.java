package baitap.baitonghop.implement;

import baitap.baitonghop.design.Manage;
import baitap.baitonghop.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DepartmentImpl implements Manage
{
    public static final List<Department> departmentList = new ArrayList<>();

    @Override
    public void displayAll()
    {
        if (departmentList.isEmpty())
        {
            System.out.println("Hiện không có phòng ban nào");
            return;
        }
        for (Department d : departmentList)
        {
            d.displayData();
        }
    }

    @Override
    public void displayInfo()
    {

    }

    @Override
    public void addElement()
    {

    }

    @Override
    public void editInfo()
    {

    }

    @Override
    public void displayInfoById()
    {

    }

    @Override
    public void deleteElement()
    {

    }

    @Override
    public int searchById(String id)
    {
        return 0;
    }
}