package ChatGPT.Java.FactoryMethod.round2.source;

public class Tea {
    public class BlackTea implements Product {
        @Override
        public String getName() {
            return "Black Tea";
        }
    }
    
    public class GreenTea implements Product {
        @Override
        public String getName() {
            return "Green Tea";
        }
    }
    
    // เพิ่มประเภทชาอื่นๆ ตามที่กำหนด...    
}
