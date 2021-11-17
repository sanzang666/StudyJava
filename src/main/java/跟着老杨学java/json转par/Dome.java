package 跟着老杨学java.json转par;

import com.alibaba.fastjson.JSONObject;

public class Dome {
    public static void main(String[] args) {
        String s = "s = {'amountBxf': '2222', 'amountBzf': '12', 'amountCod': '3333', 'billDeptId': '001881', 'businessAttributes': '55702',\n" +
                "     'businessType': '29101', 'consignee': '参数', 'consigneeAddr': '河南省郑州市二七区马砦街46号京广路,火车站',\n" +
                "     'consigneeMobile': '222222222222', 'customerRemark': '123123', 'deliveryType': '', 'discCity': '410100',\n" +
                "     'discDeptId': '008579', 'discDistrict': '410103', 'discProvince': '410000', 'forDelivery': '1', 'forHd': '1',\n" +
                "     'hdCount': '1', 'hdType': '10603', 'inputMode': '15601', 'isAutoNo': '1', 'itemJson': [\n" +
                "        {'beforeItemPrice': 1, 'itemCbm': 0, 'itemDesc': 'DF-17', 'itemKgs': 1, 'itemPkg': '10901', 'itemPrice': 1,\n" +
                "         'itemQty': 1, 'itemType': '', 'itemTypeId': ''},\n" +
                "        {'beforeItemPrice': 0, 'itemCbm': 0, 'itemDesc': '回单', 'itemKgs': 0, 'itemPkg': '10906', 'itemPrice': 0,\n" +
                "         'itemQty': 1, 'itemType': '其他类', 'itemTypeId': '13A4488B265A4940AEA2638DB49F163D'}],\n" +
                "     'modeOfSettlement': '10302', 'orderDate': '1627626752814', 'orderRefNo': '', 'orderRemark': '',\n" +
                "     'orderSales': '丈子头网点', 'orderType': '11301', 'serviceProduct': 'CP003', 'serviceType': '10101', 'shipper': '乐仁堂',\n" +
                "     'shipperAddr': '', 'shipperIdcard': '', 'shipperMobile': '13323013226', 'totalAmount': ''}";
        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println(jsonObject);

    }
}
