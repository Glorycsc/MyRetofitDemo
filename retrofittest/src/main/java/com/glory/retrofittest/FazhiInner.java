package com.glory.retrofittest;

import java.util.List;

/**
 * Create by glorizz on 2018/8/15
 * Describe:
 */
public class FazhiInner
{
    /**
     * orgJson : {"menu":[{"classname":"全国人民代表大会","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":1,"status":0},{"classname":"全国人民代表大会常务委员会","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":2,"status":0},{"classname":"最高人民法院","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":3,"status":0},{"classname":"最高人民检察院","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":4,"status":0},{"classname":"国务院","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":5,"status":0},{"classname":"国务院各机构","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":6,"status":0},{"classname":"国家其他机构","classvalue":"","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":7,"status":0}]}
     * ruleJson : {"menu":[{"classname":"宪法类","classvalue":"1000","childMenus":[{"classname":"宪法","classvalue":"1010","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":2,"status":0},{"classname":"国家机构法","classvalue":"1020","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":3,"status":0},{"classname":"选举、代表","classvalue":"1021","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":4,"status":0},{"classname":"国家机构组织","classvalue":"1022","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":5,"status":0},{"classname":"立法制度","classvalue":"1030","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":6,"status":0},{"classname":"民族区域自治","classvalue":"1040","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":7,"status":0},{"classname":"特别行政区","classvalue":"1050","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":8,"status":0},{"classname":"香港特别行政区","classvalue":"1051","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":9,"status":0},{"classname":"澳门特别行政区","classvalue":"1052","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":10,"status":0},{"classname":"相关法","classvalue":"1060","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":11,"status":0},{"classname":"国籍、国旗、国徽","classvalue":"1061","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":12,"status":0},{"classname":"领土、领海、领空","classvalue":"1062","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":13,"status":0},{"classname":"其他","classvalue":"3193","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":14,"status":0},{"classname":"宪法类其他","classvalue":"1070","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":15,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":1,"status":0},{"classname":"民法商法类","classvalue":"2000","childMenus":[{"classname":"总类","classvalue":"3010","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":17,"status":0},{"classname":"物权","classvalue":"2020","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":18,"status":0},{"classname":"债权","classvalue":"2030","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":19,"status":0},{"classname":"知识产权","classvalue":"2040","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":20,"status":0},{"classname":"综合","classvalue":"3161","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":21,"status":0},{"classname":"著作权","classvalue":"2042","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":22,"status":0},{"classname":"专利权","classvalue":"2043","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":23,"status":0},{"classname":"商标权","classvalue":"2044","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":24,"status":0},{"classname":"知识产权海关保护","classvalue":"2045","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":25,"status":0},{"classname":"亲属、继承","classvalue":"2050","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":26,"status":0},{"classname":"亲属","classvalue":"2051","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":27,"status":0},{"classname":"继承","classvalue":"2052","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":28,"status":0},{"classname":"商法","classvalue":"2060","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":29,"status":0},{"classname":"企业","classvalue":"2061","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":30,"status":0},{"classname":"公司","classvalue":"2062","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":31,"status":0},{"classname":"破产","classvalue":"2063","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":32,"status":0},{"classname":"信托","classvalue":"2064","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":33,"status":0},{"classname":"保险","classvalue":"2065","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":34,"status":0},{"classname":"票据","classvalue":"2066","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":35,"status":0},{"classname":"证券、期货、基金","classvalue":"2067","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":36,"status":0},{"classname":"海商","classvalue":"2068","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":37,"status":0},{"classname":"商法类其他","classvalue":"2069","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":38,"status":0},{"classname":"民法商法类其他","classvalue":"2070","childMenus":[],"classename":"","parentclassid":16,"remarks":"","seqid":39,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":16,"status":0},{"classname":"行政法类","classvalue":"3000","childMenus":[{"classname":"总类","classvalue":"3010","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":41,"status":0},{"classname":"行政机构设置、职权划分","classvalue":"3011","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":42,"status":0},{"classname":"行政区划","classvalue":"3012","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":43,"status":0},{"classname":"政府法制","classvalue":"3013","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":44,"status":0},{"classname":"机关工作","classvalue":"3014","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":45,"status":0},{"classname":"行政法总类其他","classvalue":"3015","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":46,"status":0},{"classname":"刑法类其他","classvalue":"3020","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":47,"status":0},{"classname":"国防","classvalue":"3030","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":48,"status":0},{"classname":"公安","classvalue":"3040","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":49,"status":0},{"classname":"国家安全","classvalue":"3050","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":50,"status":0},{"classname":"民政","classvalue":"3060","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":51,"status":0},{"classname":"司法行政","classvalue":"3070","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":52,"status":0},{"classname":"人事","classvalue":"3080","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":53,"status":0},{"classname":"公务员","classvalue":"3081","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":54,"status":0},{"classname":"其他人事管理","classvalue":"3082","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":55,"status":0},{"classname":"政纪、监察","classvalue":"3083","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":56,"status":0},{"classname":"民族事务","classvalue":"3090","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":57,"status":0},{"classname":"宗教事务","classvalue":"3100","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":58,"status":0},{"classname":"侨务","classvalue":"3110","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":59,"status":0},{"classname":"台湾事务","classvalue":"3120","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":60,"status":0},{"classname":"教育","classvalue":"3130","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":61,"status":0},{"classname":"教育管理","classvalue":"3131","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":62,"status":0},{"classname":"语言文字","classvalue":"3132","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":63,"status":0},{"classname":"教育类其他","classvalue":"3133","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":64,"status":0},{"classname":"科学技术","classvalue":"3140","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":65,"status":0},{"classname":"文化、体育","classvalue":"3150","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":66,"status":0},{"classname":"新闻出版","classvalue":"3151","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":67,"status":0},{"classname":"广播影视","classvalue":"3152","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":68,"status":0},{"classname":"文化","classvalue":"3153","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":69,"status":0},{"classname":"文物保护","classvalue":"3154","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":70,"status":0},{"classname":"体育","classvalue":"3155","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":71,"status":0},{"classname":"文化、体育类其他","classvalue":"3156","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":72,"status":0},{"classname":"卫生医药、计划生育","classvalue":"3160","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":73,"status":0},{"classname":"综合","classvalue":"3161","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":74,"status":0},{"classname":"卫生医药","classvalue":"3162","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":75,"status":0},{"classname":"计划生育","classvalue":"3163","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":76,"status":0},{"classname":"职业病防治","classvalue":"3164","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":77,"status":0},{"classname":"卫生医药、计划生育类其他","classvalue":"3165","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":78,"status":0},{"classname":"城乡建设","classvalue":"3170","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":79,"status":0},{"classname":"城市建设","classvalue":"3171","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":80,"status":0},{"classname":"村镇建设","classvalue":"3172","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":81,"status":0},{"classname":"工程建筑","classvalue":"3173","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":82,"status":0},{"classname":"房地产","classvalue":"3174","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":83,"status":0},{"classname":"风景名胜","classvalue":"3175","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":84,"status":0},{"classname":"城乡建设类其他","classvalue":"3176","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":85,"status":0},{"classname":"环境保护","classvalue":"3180","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":86,"status":0},{"classname":"气象、地震","classvalue":"3190","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":87,"status":0},{"classname":"气象","classvalue":"3191","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":88,"status":0},{"classname":"地震","classvalue":"3192","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":89,"status":0},{"classname":"其他","classvalue":"3193","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":90,"status":0},{"classname":"旅游","classvalue":"3200","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":91,"status":0},{"classname":"安全生产","classvalue":"3210","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":92,"status":0},{"classname":"行政许可","classvalue":"3220","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":93,"status":0},{"classname":"行政复议","classvalue":"3230","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":94,"status":0},{"classname":"行政法类其他","classvalue":"3240","childMenus":[],"classename":"","parentclassid":40,"remarks":"","seqid":95,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":40,"status":0},{"classname":"经济法","classvalue":"4000","childMenus":[{"classname":"经济体制","classvalue":"4010","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":97,"status":0},{"classname":"财政","classvalue":"4020","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":98,"status":0},{"classname":"国有资产监管","classvalue":"4030","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":99,"status":0},{"classname":"税务","classvalue":"4040","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":100,"status":0},{"classname":"金融","classvalue":"4050","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":101,"status":0},{"classname":"外汇管理","classvalue":"4060","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":102,"status":0},{"classname":"基本建设","classvalue":"4070","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":103,"status":0},{"classname":"国土资源","classvalue":"4080","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":104,"status":0},{"classname":"土地","classvalue":"4081","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":105,"status":0},{"classname":"地质矿产","classvalue":"4082","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":106,"status":0},{"classname":"海洋","classvalue":"4083","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":107,"status":0},{"classname":"测绘","classvalue":"4084","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":108,"status":0},{"classname":"能源","classvalue":"4090","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":109,"status":0},{"classname":"交通运输","classvalue":"4100","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":110,"status":0},{"classname":"铁路","classvalue":"4110","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":111,"status":0},{"classname":"民航","classvalue":"4120","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":112,"status":0},{"classname":"信息、邮政","classvalue":"4130","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":113,"status":0},{"classname":"信息产业","classvalue":"4131","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":114,"status":0},{"classname":"电信","classvalue":"4132","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":115,"status":0},{"classname":"邮政","classvalue":"4133","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":116,"status":0},{"classname":"信息、邮政其他","classvalue":"4134","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":117,"status":0},{"classname":"水利","classvalue":"4140","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":118,"status":0},{"classname":"农林牧渔","classvalue":"4150","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":119,"status":0},{"classname":"农业","classvalue":"4151","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":120,"status":0},{"classname":"林业","classvalue":"4152","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":121,"status":0},{"classname":"畜牧业","classvalue":"4153","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":122,"status":0},{"classname":"渔业","classvalue":"4154","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":123,"status":0},{"classname":"动植物检疫","classvalue":"4155","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":124,"status":0},{"classname":"农林牧渔类其他","classvalue":"4156","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":125,"status":0},{"classname":"商务","classvalue":"4160","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":126,"status":0},{"classname":"国内贸易","classvalue":"4161","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":127,"status":0},{"classname":"对外贸易经济合作","classvalue":"4162","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":128,"status":0},{"classname":"专营、专卖","classvalue":"4163","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":129,"status":0},{"classname":"海关","classvalue":"4180","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":130,"status":0},{"classname":"海关管理","classvalue":"4181","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":131,"status":0},{"classname":"口岸管理","classvalue":"4182","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":132,"status":0},{"classname":"审计","classvalue":"4190","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":133,"status":0},{"classname":"统计","classvalue":"4200","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":134,"status":0},{"classname":"物价","classvalue":"4210","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":135,"status":0},{"classname":"质量监督、检验检疫","classvalue":"4220","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":136,"status":0},{"classname":"计量","classvalue":"4221","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":137,"status":0},{"classname":"标准","classvalue":"4222","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":138,"status":0},{"classname":"产品质量","classvalue":"4223","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":139,"status":0},{"classname":"进出境商品检验","classvalue":"4224","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":140,"status":0},{"classname":"质量监督、检验检疫类其他","classvalue":"4225","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":141,"status":0},{"classname":"工商行政管理","classvalue":"4230","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":142,"status":0},{"classname":"经济法其他","classvalue":"4240","childMenus":[],"classename":"","parentclassid":96,"remarks":"","seqid":143,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":96,"status":0},{"classname":"社会法","classvalue":"5000","childMenus":[{"classname":"社会组织","classvalue":"5010","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":145,"status":0},{"classname":"社会救济","classvalue":"5020","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":146,"status":0},{"classname":"特殊保障","classvalue":"5030","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":147,"status":0},{"classname":"社会保险","classvalue":"5040","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":148,"status":0},{"classname":"劳动用工","classvalue":"5050","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":149,"status":0},{"classname":"劳动保护","classvalue":"5060","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":150,"status":0},{"classname":"工资福利","classvalue":"5070","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":151,"status":0},{"classname":"社会法类其他","classvalue":"5080","childMenus":[],"classename":"","parentclassid":144,"remarks":"","seqid":152,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":144,"status":0},{"classname":"刑法类","classvalue":"6000","childMenus":[{"classname":"刑法","classvalue":"6010","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":154,"status":0},{"classname":"总则","classvalue":"6020","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":155,"status":0},{"classname":"刑法基本原则","classvalue":"6021","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":156,"status":0},{"classname":"犯罪","classvalue":"6022","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":157,"status":0},{"classname":"刑罚","classvalue":"6023","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":158,"status":0},{"classname":"分则","classvalue":"6030","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":159,"status":0},{"classname":"危害国家安全罪","classvalue":"6031","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":160,"status":0},{"classname":"危害公共安全罪","classvalue":"6032","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":161,"status":0},{"classname":"破坏社会主义市场经济秩序罪","classvalue":"6033","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":162,"status":0},{"classname":"侵犯公民人身权利、民主权利罪","classvalue":"6034","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":163,"status":0},{"classname":"侵犯财产罪","classvalue":"6035","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":164,"status":0},{"classname":"妨害社会管理秩序罪","classvalue":"6036","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":165,"status":0},{"classname":"贪污贿赂罪","classvalue":"6037","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":166,"status":0},{"classname":"渎职罪","classvalue":"6038","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":167,"status":0},{"classname":"军人违反职责罪","classvalue":"6039","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":168,"status":0},{"classname":"刑法类其他","classvalue":"6040","childMenus":[],"classename":"","parentclassid":153,"remarks":"","seqid":169,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":153,"status":0},{"classname":"诉讼及非诉讼程序法","classvalue":"7000","childMenus":[{"classname":"刑事诉讼","classvalue":"7010","childMenus":[],"classename":"","parentclassid":170,"remarks":"","seqid":171,"status":0},{"classname":"民事诉讼","classvalue":"7020","childMenus":[],"classename":"","parentclassid":170,"remarks":"","seqid":172,"status":0},{"classname":"行政诉讼","classvalue":"7030","childMenus":[],"classename":"","parentclassid":170,"remarks":"","seqid":173,"status":0},{"classname":"仲裁","classvalue":"7040","childMenus":[],"classename":"","parentclassid":170,"remarks":"","seqid":174,"status":0},{"classname":"诉讼及非诉讼程序法类其他","classvalue":"7050","childMenus":[],"classename":"","parentclassid":170,"remarks":"","seqid":175,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":170,"status":0},{"classname":"国际公约、条约","classvalue":"8000","childMenus":[{"classname":"国际公约","classvalue":"8010","childMenus":[],"classename":"","parentclassid":176,"remarks":"","seqid":177,"status":0},{"classname":"国际条约","classvalue":"8020","childMenus":[],"classename":"","parentclassid":176,"remarks":"","seqid":178,"status":0},{"classname":"国际惯例","classvalue":"8030","childMenus":[],"classename":"","parentclassid":176,"remarks":"","seqid":179,"status":0},{"classname":"国际公约、条约其他","classvalue":"8040","childMenus":[],"classename":"","parentclassid":176,"remarks":"","seqid":180,"status":0}],"classename":"","parentclassid":0,"remarks":"","seqid":176,"status":0}]}
     * effJson : [[{"classname":"","classvalue":"","childMenus":[],"classename":"效力层级","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"部门规章","classvalue":"1","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"法规","classvalue":"2","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"法律","classvalue":"3","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"法文（国务院公报）","classvalue":"4","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"司法解释","classvalue":"5","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"司法文","classvalue":"6","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0}],[{"classname":"","classvalue":"","childMenus":[],"classename":"时效性","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"现行有效","classvalue":"1","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"失效","classvalue":"2","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"已修正","classvalue":"3","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0},{"classname":"待生效","classvalue":"4","childMenus":[],"classename":"","parentclassid":0,"remarks":"","seqid":0,"status":0}]]
     */

    private OrgJsonBean orgJson;
    private RuleJsonBean ruleJson;
    private List<List<EffJsonBean>> effJson;

    @Override
    public String toString() {
        return "FazhiInner{" +
                "orgJson=" + orgJson +
                ", ruleJson=" + ruleJson +
                ", effJson=" + effJson +
                '}';
    }

    public OrgJsonBean getOrgJson() {
        return orgJson;
    }

    public void setOrgJson(OrgJsonBean orgJson) {
        this.orgJson = orgJson;
    }

    public RuleJsonBean getRuleJson() {
        return ruleJson;
    }

    public void setRuleJson(RuleJsonBean ruleJson) {
        this.ruleJson = ruleJson;
    }

    public List<List<EffJsonBean>> getEffJson() {
        return effJson;
    }

    public void setEffJson(List<List<EffJsonBean>> effJson) {
        this.effJson = effJson;
    }

    public static class OrgJsonBean {
        private List<MenuBean> menu;

        @Override
        public String toString() {
            return "OrgJsonBean{" +
                    "menu=" + menu +
                    '}';
        }

        public List<MenuBean> getMenu() {
            return menu;
        }

        public void setMenu(List<MenuBean> menu) {
            this.menu = menu;
        }

        public static class MenuBean {
            /**
             * classname : 全国人民代表大会
             * classvalue :
             * childMenus : []
             * classename :
             * parentclassid : 0
             * remarks :
             * seqid : 1
             * status : 0
             */

            private String classname;
            private String classvalue;
            private String classename;
            private int parentclassid;
            private String remarks;
            private int seqid;
            private int status;
            private List<?> childMenus;

            @Override
            public String toString() {
                return "MenuBean{" +
                        "classname='" + classname + '\'' +
                        ", classvalue='" + classvalue + '\'' +
                        ", classename='" + classename + '\'' +
                        ", parentclassid=" + parentclassid +
                        ", remarks='" + remarks + '\'' +
                        ", seqid=" + seqid +
                        ", status=" + status +
                        ", childMenus=" + childMenus +
                        '}';
            }

            public String getClassname() {
                return classname;
            }

            public void setClassname(String classname) {
                this.classname = classname;
            }

            public String getClassvalue() {
                return classvalue;
            }

            public void setClassvalue(String classvalue) {
                this.classvalue = classvalue;
            }

            public String getClassename() {
                return classename;
            }

            public void setClassename(String classename) {
                this.classename = classename;
            }

            public int getParentclassid() {
                return parentclassid;
            }

            public void setParentclassid(int parentclassid) {
                this.parentclassid = parentclassid;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
            }

            public int getSeqid() {
                return seqid;
            }

            public void setSeqid(int seqid) {
                this.seqid = seqid;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<?> getChildMenus() {
                return childMenus;
            }

            public void setChildMenus(List<?> childMenus) {
                this.childMenus = childMenus;
            }
        }
    }

    public static class RuleJsonBean {
        private List<MenuBeanX> menu;

        @Override
        public String toString() {
            return "RuleJsonBean{" +
                    "menu=" + menu +
                    '}';
        }

        public List<MenuBeanX> getMenu() {
            return menu;
        }

        public void setMenu(List<MenuBeanX> menu) {
            this.menu = menu;
        }

        public static class MenuBeanX {
            /**
             * classname : 宪法类
             * classvalue : 1000
             * childMenus : [{"classname":"宪法","classvalue":"1010","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":2,"status":0},{"classname":"国家机构法","classvalue":"1020","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":3,"status":0},{"classname":"选举、代表","classvalue":"1021","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":4,"status":0},{"classname":"国家机构组织","classvalue":"1022","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":5,"status":0},{"classname":"立法制度","classvalue":"1030","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":6,"status":0},{"classname":"民族区域自治","classvalue":"1040","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":7,"status":0},{"classname":"特别行政区","classvalue":"1050","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":8,"status":0},{"classname":"香港特别行政区","classvalue":"1051","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":9,"status":0},{"classname":"澳门特别行政区","classvalue":"1052","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":10,"status":0},{"classname":"相关法","classvalue":"1060","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":11,"status":0},{"classname":"国籍、国旗、国徽","classvalue":"1061","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":12,"status":0},{"classname":"领土、领海、领空","classvalue":"1062","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":13,"status":0},{"classname":"其他","classvalue":"3193","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":14,"status":0},{"classname":"宪法类其他","classvalue":"1070","childMenus":[],"classename":"","parentclassid":1,"remarks":"","seqid":15,"status":0}]
             * classename :
             * parentclassid : 0
             * remarks :
             * seqid : 1
             * status : 0
             */

            private String classname;
            private String classvalue;
            private String classename;
            private int parentclassid;
            private String remarks;
            private int seqid;
            private int status;
            private List<ChildMenusBean> childMenus;

            @Override
            public String toString() {
                return "MenuBeanX{" +
                        "classname='" + classname + '\'' +
                        ", classvalue='" + classvalue + '\'' +
                        ", classename='" + classename + '\'' +
                        ", parentclassid=" + parentclassid +
                        ", remarks='" + remarks + '\'' +
                        ", seqid=" + seqid +
                        ", status=" + status +
                        ", childMenus=" + childMenus +
                        '}';
            }

            public String getClassname() {
                return classname;
            }

            public void setClassname(String classname) {
                this.classname = classname;
            }

            public String getClassvalue() {
                return classvalue;
            }

            public void setClassvalue(String classvalue) {
                this.classvalue = classvalue;
            }

            public String getClassename() {
                return classename;
            }

            public void setClassename(String classename) {
                this.classename = classename;
            }

            public int getParentclassid() {
                return parentclassid;
            }

            public void setParentclassid(int parentclassid) {
                this.parentclassid = parentclassid;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
            }

            public int getSeqid() {
                return seqid;
            }

            public void setSeqid(int seqid) {
                this.seqid = seqid;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ChildMenusBean> getChildMenus() {
                return childMenus;
            }

            public void setChildMenus(List<ChildMenusBean> childMenus) {
                this.childMenus = childMenus;
            }

            public static class ChildMenusBean {
                /**
                 * classname : 宪法
                 * classvalue : 1010
                 * childMenus : []
                 * classename :
                 * parentclassid : 1
                 * remarks :
                 * seqid : 2
                 * status : 0
                 */

                private String classname;
                private String classvalue;
                private String classename;
                private int parentclassid;
                private String remarks;
                private int seqid;
                private int status;
                private List<?> childMenus;

                @Override
                public String toString() {
                    return "ChildMenusBean{" +
                            "classname='" + classname + '\'' +
                            ", classvalue='" + classvalue + '\'' +
                            ", classename='" + classename + '\'' +
                            ", parentclassid=" + parentclassid +
                            ", remarks='" + remarks + '\'' +
                            ", seqid=" + seqid +
                            ", status=" + status +
                            ", childMenus=" + childMenus +
                            '}';
                }

                public String getClassname() {
                    return classname;
                }

                public void setClassname(String classname) {
                    this.classname = classname;
                }

                public String getClassvalue() {
                    return classvalue;
                }

                public void setClassvalue(String classvalue) {
                    this.classvalue = classvalue;
                }

                public String getClassename() {
                    return classename;
                }

                public void setClassename(String classename) {
                    this.classename = classename;
                }

                public int getParentclassid() {
                    return parentclassid;
                }

                public void setParentclassid(int parentclassid) {
                    this.parentclassid = parentclassid;
                }

                public String getRemarks() {
                    return remarks;
                }

                public void setRemarks(String remarks) {
                    this.remarks = remarks;
                }

                public int getSeqid() {
                    return seqid;
                }

                public void setSeqid(int seqid) {
                    this.seqid = seqid;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public List<?> getChildMenus() {
                    return childMenus;
                }

                public void setChildMenus(List<?> childMenus) {
                    this.childMenus = childMenus;
                }
            }
        }
    }

    public static class EffJsonBean {
        /**
         * classname :
         * classvalue :
         * childMenus : []
         * classename : 效力层级
         * parentclassid : 0
         * remarks :
         * seqid : 0
         * status : 0
         */

        private String classname;
        private String classvalue;
        private String classename;
        private int parentclassid;
        private String remarks;
        private int seqid;
        private int status;
        private List<?> childMenus;

        @Override
        public String toString() {
            return "EffJsonBean{" +
                    "classname='" + classname + '\'' +
                    ", classvalue='" + classvalue + '\'' +
                    ", classename='" + classename + '\'' +
                    ", parentclassid=" + parentclassid +
                    ", remarks='" + remarks + '\'' +
                    ", seqid=" + seqid +
                    ", status=" + status +
                    ", childMenus=" + childMenus +
                    '}';
        }

        public String getClassname() {
            return classname;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }

        public String getClassvalue() {
            return classvalue;
        }

        public void setClassvalue(String classvalue) {
            this.classvalue = classvalue;
        }

        public String getClassename() {
            return classename;
        }

        public void setClassename(String classename) {
            this.classename = classename;
        }

        public int getParentclassid() {
            return parentclassid;
        }

        public void setParentclassid(int parentclassid) {
            this.parentclassid = parentclassid;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public int getSeqid() {
            return seqid;
        }

        public void setSeqid(int seqid) {
            this.seqid = seqid;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<?> getChildMenus() {
            return childMenus;
        }

        public void setChildMenus(List<?> childMenus) {
            this.childMenus = childMenus;
        }
    }
}
