package businesslogic;

import businesslogicservice.MemberBLService;
import businesslogicservice.ResultMessage;
import vo.MemberVO;

import java.util.ArrayList;

/**
 * Created by py on 2017/10/20.
 */
public class MemberBLService_Stub implements MemberBLService{
    String number;          //编号
    String memberClass;        //分类（进货商、销售商）
    int level;              //级别（五级，一级普通用户，五级VIP客户）
    String name;            //姓名
    String phoneNumber;     //电话
    String address;         //地址
    String postcode;        //邮编
    String mailaddress;     //电子邮箱
    long collectionLimit;   //应收额度
    long collection;        //应收
    long payment;           //应付
    String managePerson;    //默认业务员

    public MemberBLService_Stub(String number, String memberClass, int level, String name, String phoneNumber,
                    String address, String postcode, String mailaddress, long collectionLimit,
                    long collection, long payment, String managePerson){
        this.number = number;
        this.memberClass = memberClass;
        this.level = level;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postcode = postcode;
        this.mailaddress = mailaddress;
        this.collectionLimit = collectionLimit;
        this.collection = collection;
        this.payment = payment;
        this.managePerson = managePerson;
    }

    public ResultMessage add(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ResultMessage delete(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ResultMessage modify(MemberVO vo){
        if(vo != null)
            return ResultMessage.Success;
        else
            return ResultMessage.Fail;
    }

    public ArrayList<MemberVO> find(String keywords){
        ArrayList<MemberVO> list = new ArrayList<>();
        return list;    //数据库实现后具体实现
    }

}
