package com.example.postjson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WuXiaolong on 2017/9/21.
 * 个人博客：http：//wuxiaolong.me
 */

public class MyBookPlaceOrderModel implements Serializable {


    /**
     * data : {"baseInfo":{"fullcutAmount":0,"totalFee":"10.00","cashDiscount":0,"kbDiscount":0},"user_balance":{"kb_balance":"999911.99"},"paymentStateObject":{"alipaySwitch":1,"last_update_time":"2018-05-25 15:02:40","weChatSwitch":1,"unionPaySwitch":1},"defaultAddressObject":{"area":"","last_modify_date":"2018-05-21 14:15:01","address":"后悔","address_type":1,"city":"130700","pname":"河北省","mobile":"17710749667","cname":"张家口市","province":"130000","user_id":2283,"phone":"","district":"130702","post_code":"","name":"尖叫","id":126,"dname":"桥东区","create_date":"2018-05-21 14:15:01","email":"","status":1},"freightPrices":[],"booksInfo":[{"simpleTotalPrice":"10.00","price":"10.00","count":"3","title":"江苏云锦","url":"http://123.59.197.176:8531/static/image/201708/0a869a20-1e0f-4732-9fb4-ed33088b840b_source.jpg","bookId":6431}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }


    public static class DataBean implements Serializable {
        /**
         * baseInfo : {"fullcutAmount":0,"totalFee":"10.00","cashDiscount":0,"kbDiscount":0}
         * user_balance : {"kb_balance":"999911.99"}
         * paymentStateObject : {"alipaySwitch":1,"last_update_time":"2018-05-25 15:02:40","weChatSwitch":1,"unionPaySwitch":1}
         * defaultAddressObject : {"area":"","last_modify_date":"2018-05-21 14:15:01","address":"后悔","address_type":1,"city":"130700","pname":"河北省","mobile":"17710749667","cname":"张家口市","province":"130000","user_id":2283,"phone":"","district":"130702","post_code":"","name":"尖叫","id":126,"dname":"桥东区","create_date":"2018-05-21 14:15:01","email":"","status":1}
         * freightPrices : []
         * booksInfo : [{"simpleTotalPrice":"10.00","price":"10.00","count":"3","title":"江苏云锦","url":"http://123.59.197.176:8531/static/image/201708/0a869a20-1e0f-4732-9fb4-ed33088b840b_source.jpg","bookId":6431}]
         */

        private BaseInfoBean baseInfo;
        private UserBalanceBean user_balance;
        private PaymentStateObjectBean paymentStateObject;
        private DefaultAddressObjectBean defaultAddressObject;
        private List<?> freightPrices;
        private List<BooksInfoBean> booksInfo;

        public BaseInfoBean getBaseInfo() {
            return baseInfo;
        }

        public void setBaseInfo(BaseInfoBean baseInfo) {
            this.baseInfo = baseInfo;
        }

        public UserBalanceBean getUser_balance() {
            return user_balance;
        }

        public void setUser_balance(UserBalanceBean user_balance) {
            this.user_balance = user_balance;
        }

        public PaymentStateObjectBean getPaymentStateObject() {
            return paymentStateObject;
        }

        public void setPaymentStateObject(PaymentStateObjectBean paymentStateObject) {
            this.paymentStateObject = paymentStateObject;
        }

        public DefaultAddressObjectBean getDefaultAddressObject() {
            return defaultAddressObject;
        }

        public void setDefaultAddressObject(DefaultAddressObjectBean defaultAddressObject) {
            this.defaultAddressObject = defaultAddressObject;
        }

        public List<?> getFreightPrices() {
            return freightPrices;
        }

        public void setFreightPrices(List<?> freightPrices) {
            this.freightPrices = freightPrices;
        }

        public List<BooksInfoBean> getBooksInfo() {
            return booksInfo;
        }

        public void setBooksInfo(List<BooksInfoBean> booksInfo) {
            this.booksInfo = booksInfo;
        }

        public static class BaseInfoBean implements Serializable {
            /**
             * fullcutAmount : 0
             * totalFee : 10.00
             * cashDiscount : 0
             * kbDiscount : 0
             */

            private int fullcutAmount;
            private String totalFee;
            private int cashDiscount;
            private int kbDiscount;

            public int getFullcutAmount() {
                return fullcutAmount;
            }

            public void setFullcutAmount(int fullcutAmount) {
                this.fullcutAmount = fullcutAmount;
            }

            public String getTotalFee() {
                return totalFee;
            }

            public void setTotalFee(String totalFee) {
                this.totalFee = totalFee;
            }

            public int getCashDiscount() {
                return cashDiscount;
            }

            public void setCashDiscount(int cashDiscount) {
                this.cashDiscount = cashDiscount;
            }

            public int getKbDiscount() {
                return kbDiscount;
            }

            public void setKbDiscount(int kbDiscount) {
                this.kbDiscount = kbDiscount;
            }
        }

        public static class UserBalanceBean implements Serializable {
            /**
             * kb_balance : 999911.99
             */

            private String kb_balance;

            public String getKb_balance() {
                return kb_balance;
            }

            public void setKb_balance(String kb_balance) {
                this.kb_balance = kb_balance;
            }
        }

        public static class PaymentStateObjectBean implements Serializable {
            /**
             * alipaySwitch : 1
             * last_update_time : 2018-05-25 15:02:40
             * weChatSwitch : 1
             * unionPaySwitch : 1
             */

            private int alipaySwitch;
            private String last_update_time;
            private int weChatSwitch;
            private int unionPaySwitch;

            public int getAlipaySwitch() {
                return alipaySwitch;
            }

            public void setAlipaySwitch(int alipaySwitch) {
                this.alipaySwitch = alipaySwitch;
            }

            public String getLast_update_time() {
                return last_update_time;
            }

            public void setLast_update_time(String last_update_time) {
                this.last_update_time = last_update_time;
            }

            public int getWeChatSwitch() {
                return weChatSwitch;
            }

            public void setWeChatSwitch(int weChatSwitch) {
                this.weChatSwitch = weChatSwitch;
            }

            public int getUnionPaySwitch() {
                return unionPaySwitch;
            }

            public void setUnionPaySwitch(int unionPaySwitch) {
                this.unionPaySwitch = unionPaySwitch;
            }
        }

        public static class DefaultAddressObjectBean implements Serializable {
            /**
             * area :
             * last_modify_date : 2018-05-21 14:15:01
             * address : 后悔
             * address_type : 1
             * city : 130700
             * pname : 河北省
             * mobile : 17710749667
             * cname : 张家口市
             * province : 130000
             * user_id : 2283
             * phone :
             * district : 130702
             * post_code :
             * name : 尖叫
             * id : 126
             * dname : 桥东区
             * create_date : 2018-05-21 14:15:01
             * email :
             * status : 1
             */

            private String area;
            private String last_modify_date;
            private String address;
            private int address_type;
            private String city;
            private String pname;
            private String mobile;
            private String cname;
            private String province;
            private int user_id;
            private String phone;
            private String district;
            private String post_code;
            private String name;
            private int id;
            private String dname;
            private String create_date;
            private String email;
            private int status;

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getLast_modify_date() {
                return last_modify_date;
            }

            public void setLast_modify_date(String last_modify_date) {
                this.last_modify_date = last_modify_date;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getAddress_type() {
                return address_type;
            }

            public void setAddress_type(int address_type) {
                this.address_type = address_type;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getPname() {
                return pname;
            }

            public void setPname(String pname) {
                this.pname = pname;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getCname() {
                return cname;
            }

            public void setCname(String cname) {
                this.cname = cname;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getPost_code() {
                return post_code;
            }

            public void setPost_code(String post_code) {
                this.post_code = post_code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDname() {
                return dname;
            }

            public void setDname(String dname) {
                this.dname = dname;
            }

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }

        public static class BooksInfoBean implements Serializable {
            /**
             * simpleTotalPrice : 10.00
             * price : 10.00
             * count : 3
             * title : 江苏云锦
             * url : http://123.59.197.176:8531/static/image/201708/0a869a20-1e0f-4732-9fb4-ed33088b840b_source.jpg
             * bookId : 6431
             */

            private String simpleTotalPrice;
            private String price;
            private String count;
            private String title;
            private String url;
            private int bookId;

            @Override
            public String toString() {
                return "BooksInfoBean{" +
                        "simpleTotalPrice='" + simpleTotalPrice + '\'' +
                        ", price='" + price + '\'' +
                        ", count='" + count + '\'' +
                        ", title='" + title + '\'' +
                        ", url='" + url + '\'' +
                        ", bookId=" + bookId +
                        '}';
            }

            public String getSimpleTotalPrice() {
                return simpleTotalPrice;
            }

            public void setSimpleTotalPrice(String simpleTotalPrice) {
                this.simpleTotalPrice = simpleTotalPrice;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getBookId() {
                return bookId;
            }

            public void setBookId(int bookId) {
                this.bookId = bookId;
            }
        }
    }
}
