import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CaculatorTest {

    //add_1_bvc

    @Test
    public void add1_bvc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,0);
        int expected = -999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,0);
        int expected = -999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,0);
        int expected = 999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,0);
        int expected = 999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,-111111);
        int expected = -111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,-111110);
        int expected = -111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,111111);
        int expected = 111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,111110);
        int expected = 111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_bvc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,0);
        int expected = 0;
        assertEquals(expected,calculate);
    }

    //add_1_worstCase

    @Test
    public void add1_wc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,-111110);
        int expected = -1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,-111110);
        int expected = -1111108;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,-111110);
        int expected = 888889;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,-111110);
        int expected = 888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,-111110);
        int expected = -111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,111111);
        int expected = -888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,111111);
        int expected = -888887;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,111111);
        int expected = 1111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,111111);
        int expected = 1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,111111);
        int expected = 111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,111110);
        int expected = -888889;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,111110);
        int expected = -888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,111110);
        int expected = 1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_14 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,111110);
        int expected = 1111108;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_15 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,111110);
        int expected = 111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_16 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,0);
        int expected = -999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_17 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,0);
        int expected = -999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_18 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,0);
        int expected = 999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_19 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,0);
        int expected = 999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_20 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,0);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_21 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999999,-111111);
        int expected = -1111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_22 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(-999998,-111111);
        int expected = -1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_23 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999999,-111111);
        int expected = 888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_24 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(999998,-111111);
        int expected = 888887;
        assertEquals(expected,calculate);
    }
    @Test
    public void add1_wc_25 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(0,-111111);
        int expected = -111111;
        assertEquals(expected,calculate);
    }

    //add_2_bvc

    @Test
    public void add2_bvc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,505);
        int expected = 758;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,505);
        int expected = 759;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,505);
        int expected = 857;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,505);
        int expected = 856;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,505);
        int expected = 560;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,505);
        int expected = 561;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,505);
        int expected = 1055;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,505);
        int expected = 1054;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,10);
        int expected = 312;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,11);
        int expected = 313;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,1000);
        int expected = 1302;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,999);
        int expected = 1301;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_bvc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,505);
        int expected = 807;
        assertEquals(expected,calculate);
    }

    //add_2_worstCase

    @Test
    public void add2_wc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,6,11);
        int expected = 18;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,6,11);
        int expected = 19;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,6,11);
        int expected = 117;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,6,11);
        int expected = 116;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,11);
        int expected = 67;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,500,11);
        int expected = 512;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,500,11);
        int expected = 513;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,500,11);
        int expected = 611;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,500,11);
        int expected = 610;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,11);
        int expected = 561;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,499,11);
        int expected = 511;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,499,11);
        int expected = 512;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,499,11);
        int expected = 610;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_14 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,499,11);
        int expected = 609;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_15 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,11);
        int expected = 560;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_16 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,11);
        int expected = 264;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_17 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,11);
        int expected = 265;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_18 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,11);
        int expected = 363;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_19 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,11);
        int expected = 362;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_20 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,11);
        int expected = 313;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_21 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,5,11);
        int expected = 17;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_22 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,5,11);
        int expected = 18;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_23 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,5,11);
        int expected = 116;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_24 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,5,11);
        int expected = 115;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_25 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,11);
        int expected = 66;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_26 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,6,1000);
        int expected = 1007;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_27 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,6,1000);
        int expected = 1008;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_28 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,6,1000);
        int expected = 1106;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_29 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,6,1000);
        int expected = 1105;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_30 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,1000);
        int expected = 1056;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_31 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,500,1000);
        int expected = 1501;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_32 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,500,1000);
        int expected = 1502;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_33 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,500,1000);
        int expected = 1600;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_34 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,500,1000);
        int expected = 1599;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_35 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,1000);
        int expected = 1550;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_36 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,499,1000);
        int expected = 1500;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_37 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,499,1000);
        int expected = 1501;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_38 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,499,1000);
        int expected = 1599;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_39 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,499,1000);
        int expected = 1598;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_40 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,1000);
        int expected = 1549;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_41 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,1000);
        int expected = 1253;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_42 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,1000);
        int expected = 1254;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_43 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,1000);
        int expected = 1352;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_44 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,1000);
        int expected = 1351;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_45 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,1000);
        int expected = 1302;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_46 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,5,1000);
        int expected = 1006;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_47 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,5,1000);
        int expected = 1007;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_48 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,5,1000);
        int expected = 1105;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_49 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,5,1000);
        int expected = 1104;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_50 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,1000);
        int expected = 1055;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_51 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,6,999);
        int expected = 1006;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_52 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,6,999);
        int expected = 1007;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_53 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,6,999);
        int expected = 1105;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_54 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,6,999);
        int expected = 1104;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_55 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,999);
        int expected = 1055;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_56 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,500,999);
        int expected = 1500;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_57 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,500,999);
        int expected = 1501;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_58 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,500,999);
        int expected = 1599;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_59 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,500,999);
        int expected = 1598;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_60 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,999);
        int expected = 1549;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_61 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,499,999);
        int expected = 1499;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_62 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,499,999);
        int expected = 1500;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_63 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,499,999);
        int expected = 1598;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_64 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,499,999);
        int expected = 1597;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_65 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,999);
        int expected = 1548;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_66 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,999);
        int expected = 1252;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_67 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,999);
        int expected = 1253;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_68 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,999);
        int expected = 1351;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_69 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,999);
        int expected = 1350;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_70 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,999);
        int expected = 1301;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_71 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,5,999);
        int expected = 1005;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_72 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,5,999);
        int expected = 1006;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_73 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,5,999);
        int expected = 1104;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_74 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,5,999);
        int expected = 1103;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_75 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,999);
        int expected = 1054;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_76 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,6,505);
        int expected = 512;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_77 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,6,505);
        int expected = 513;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_78 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,6,505);
        int expected = 611;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_79 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,6,505);
        int expected = 610;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_80 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,505);
        int expected = 561;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_81 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,500,505);
        int expected = 1006;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_82 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,500,505);
        int expected = 1007;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_83 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,500,505);
        int expected = 1105;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_84 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,500,505);
        int expected = 1104;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_85 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,505);
        int expected = 1055;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_86 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,499,505);
        int expected = 1005;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_87 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,499,505);
        int expected = 1006;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_88 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,499,505);
        int expected = 1104;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_89 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,499,505);
        int expected = 1103;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_90 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,505);
        int expected = 1054;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_91 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,505);
        int expected = 758;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_92 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,505);
        int expected = 759;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_93 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,505);
        int expected = 857;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_94 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,505);
        int expected = 856;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_95 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,505);
        int expected = 807;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_96 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,5,505);
        int expected = 511;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_97 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,5,505);
        int expected = 512;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_98 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,5,505);
        int expected = 610;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_99 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,5,505);
        int expected = 609;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_100 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,505);
        int expected = 560;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_101 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,6,10);
        int expected = 17;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_102 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,6,10);
        int expected = 18;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_103 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,6,10);
        int expected = 116;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_104 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,6,10);
        int expected = 115;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_105 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,6,10);
        int expected = 66;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_106 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,500,10);
        int expected = 511;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_107 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,500,10);
        int expected = 512;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_108 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,500,10);
        int expected = 610;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_109 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,500,10);
        int expected = 609;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_110 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,500,10);
        int expected = 560;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_111 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,499,10);
        int expected = 510;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_112 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,499,10);
        int expected = 511;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_113 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,499,10);
        int expected = 609;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_114 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,499,10);
        int expected = 608;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_115 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,499,10);
        int expected = 559;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_116 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,252,10);
        int expected = 263;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_117 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,252,10);
        int expected = 264;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_118 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,252,10);
        int expected = 362;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_119 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,252,10);
        int expected = 361;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_120 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,252,10);
        int expected = 312;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_121 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(1,5,10);
        int expected = 16;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_122 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(2,5,10);
        int expected = 17;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_123 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(100,5,10);
        int expected = 115;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_124 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(99,5,10);
        int expected = 114;
        assertEquals(expected,calculate);
    }
    @Test
    public void add2_wc_125 () {
        Caculator calc = new Caculator();
        int calculate = calc.add(50,5,10);
        int expected = 65;
        assertEquals(expected,calculate);
    }

    @Test
    public void add3 () {
        Caculator calc = new Caculator();
        ArrayList<Integer> abc= new ArrayList<>();
        abc.add(0);
        abc.add(1);
        abc.add(2);
        abc.add(3);
        int calculate = calc.add(abc);
        int expected = 6;
        assertEquals(expected,calculate);
    }



    @Test
    public void testAdd1() {
    }

    //subtract_bvc

    @Test
    public void subtract_bvc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,0);
        int expected = -999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,0);
        int expected = -999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,0);
        int expected = 999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,0);
        int expected = 999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,-111111);
        int expected = 111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,-111110);
        int expected = 111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,111111);
        int expected = -111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,111110);
        int expected = -111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_bvc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,0);
        int expected = 0;
        assertEquals(expected,calculate);
    }

    //subtract_worstCase

    @Test
    public void subtract_wc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,-111110);
        int expected = -888889;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,-111110);
        int expected = -888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,-111110);
        int expected = 1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,-111110);
        int expected = 1111108;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,-111110);
        int expected = 111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,111111);
        int expected = -1111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,111111);
        int expected = -1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,111111);
        int expected = 888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,111111);
        int expected = 888887;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,111111);
        int expected = -111111;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,111110);
        int expected = -1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,111110);
        int expected = -1111108;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,111110);
        int expected = 888889;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_14 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,111110);
        int expected = 888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_15 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,111110);
        int expected = -111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_16 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,0);
        int expected = -999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_17 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,0);
        int expected = -999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_18 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,0);
        int expected = 999999;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_19 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,0);
        int expected = 999998;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_20 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,0);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_21 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999999,-111111);
        int expected = -888888;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_22 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(-999998,-111111);
        int expected = -888887;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_23 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999999,-111111);
        int expected = 1111110;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_24 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(999998,-111111);
        int expected = 1111109;
        assertEquals(expected,calculate);
    }
    @Test
    public void subtract_wc_25 () {
        Caculator calc = new Caculator();
        int calculate = calc.subtract(0,-111111);
        int expected = 111111;
        assertEquals(expected,calculate);
    }

    //divide_bvc

    @Test
    public void divide_bvc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,500);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,501);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_bvc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }


    //divide_worstCase

    @Test
    public void divide_wc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,501);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,501);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,501);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,501);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,501);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,5000);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_14 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_15 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,4999);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_16 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_17 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_18 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_19 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_20 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,2750);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_21 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(100,500);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_22 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(101,500);
        int expected = 0;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_23 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(1000,500);
        int expected = 2;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_24 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(999,500);
        int expected = 1;
        assertEquals(expected,calculate);
    }
    @Test
    public void divide_wc_25 () {
        Caculator calc = new Caculator();
        int calculate = calc.divide(550,500);
        int expected = 1;
        assertEquals(expected,calculate);
    }

    //multiply_bvc

    @Test
    public void multiply_bvc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,2750);
        int expected = 275000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,2750);
        int expected = 277750;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,2750);
        int expected = 2750000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,2750);
        int expected = 2747250;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,500);
        int expected = 275000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,501);
        int expected = 275550;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,5000);
        int expected = 2750000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,4999);
        int expected = 2749450;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_bvc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,2750);
        int expected = 1512500;
        assertEquals(expected,calculate);
    }

    //multiply_worstCase

    @Test
    public void multiply_wc_1 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,501);
        int expected = 50100;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_2 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,501);
        int expected = 50601;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_3 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,501);
        int expected = 501000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_4 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,501);
        int expected = 500499;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_5 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,501);
        int expected = 275550;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_6 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,5000);
        int expected = 500000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_7 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,5000);
        int expected = 505000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_8 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,5000);
        int expected = 5000000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_9 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,5000);
        int expected = 4995000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_10 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,5000);
        int expected = 2750000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_11 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,4999);
        int expected = 499900;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_12 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,4999);
        int expected = 504899;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_13 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,4999);
        int expected = 4999000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_14 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,4999);
        int expected = 4994001;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_15 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,4999);
        int expected = 2749450;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_16 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,2750);
        int expected = 275000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_17 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,2750);
        int expected = 277750;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_18 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,2750);
        int expected = 2750000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_19 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,2750);
        int expected = 2747250;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_20 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,2750);
        int expected = 1512500;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_21 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(100,500);
        int expected = 50000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_22 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(101,500);
        int expected = 50500;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_23 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(1000,500);
        int expected = 500000;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_24 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(999,500);
        int expected = 499500;
        assertEquals(expected,calculate);
    }
    @Test
    public void multiply_wc_25 () {
        Caculator calc = new Caculator();
        int calculate = calc.multiply(550,500);
        int expected = 275000;
        assertEquals(expected,calculate);
    }

}