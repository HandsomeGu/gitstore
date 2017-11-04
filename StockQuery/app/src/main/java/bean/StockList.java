package bean;

import java.util.List;

/**
 * Created by guquanding on 2017/5/23.
 *  由GsonFormat生成
 *  股市列表
 */

public class StockList {

    /**
     * error_code : 0
     * reason : SUCCESSED!
     * result : {"totalCount":"1248","page":"1","num":"20","data":[{"symbol":"sh600000","name":"浦发银行","trade":"15.430","pricechange":"0.390","changepercent":"2.593","buy":"15.420","sell":"15.430","settlement":"15.040","open":"15.000","high":"15.570","low":"14.980","volume":754004,"amount":1154524439,"code":"600000","ticktime":"15:00:00"},{"symbol":"sh600004","name":"白云机场","trade":"16.430","pricechange":"-0.580","changepercent":"-3.410","buy":"16.410","sell":"16.420","settlement":"17.010","open":"16.880","high":"16.900","low":"16.210","volume":346914,"amount":572501954,"code":"600004","ticktime":"15:00:00"},{"symbol":"sh600006","name":"东风汽车","trade":"5.600","pricechange":"-0.190","changepercent":"-3.282","buy":"5.600","sell":"5.610","settlement":"5.790","open":"5.760","high":"5.790","low":"5.570","volume":107653,"amount":61041079,"code":"600006","ticktime":"15:00:00"},{"symbol":"sh600007","name":"中国国贸","trade":"20.390","pricechange":"-0.230","changepercent":"-1.115","buy":"20.300","sell":"20.390","settlement":"20.620","open":"20.620","high":"20.620","low":"19.900","volume":14852,"amount":30025481,"code":"600007","ticktime":"15:00:00"},{"symbol":"sh600008","name":"首创股份","trade":"7.060","pricechange":"-0.690","changepercent":"-8.903","buy":"7.040","sell":"7.050","settlement":"7.750","open":"7.660","high":"7.830","low":"6.980","volume":3660301,"amount":2715023085,"code":"600008","ticktime":"15:00:00"},{"symbol":"sh600009","name":"上海机场","trade":"40.150","pricechange":"0.330","changepercent":"0.829","buy":"40.150","sell":"40.160","settlement":"39.820","open":"39.510","high":"40.160","low":"38.010","volume":145912,"amount":572764710,"code":"600009","ticktime":"15:00:00"},{"symbol":"sh600010","name":"包钢股份","trade":"2.960","pricechange":"0.030","changepercent":"1.024","buy":"2.950","sell":"2.960","settlement":"2.930","open":"2.930","high":"2.960","low":"2.890","volume":665942,"amount":194759922,"code":"600010","ticktime":"15:00:00"},{"symbol":"sh600011","name":"华能国际","trade":"7.660","pricechange":"-0.140","changepercent":"-1.795","buy":"7.660","sell":"7.670","settlement":"7.800","open":"7.730","high":"7.920","low":"7.650","volume":137495,"amount":106802945,"code":"600011","ticktime":"15:00:00"},{"symbol":"sh600012","name":"皖通高速","trade":"12.290","pricechange":"-0.190","changepercent":"-1.522","buy":"12.290","sell":"12.300","settlement":"12.480","open":"12.480","high":"12.660","low":"12.180","volume":28978,"amount":35841247,"code":"600012","ticktime":"15:00:00"},{"symbol":"sh600015","name":"华夏银行","trade":"10.400","pricechange":"0.150","changepercent":"1.463","buy":"10.400","sell":"10.410","settlement":"10.250","open":"10.230","high":"10.510","low":"10.230","volume":388437,"amount":403434544,"code":"600015","ticktime":"15:00:00"},{"symbol":"sh600016","name":"民生银行","trade":"7.890","pricechange":"0.120","changepercent":"1.544","buy":"7.880","sell":"7.890","settlement":"7.770","open":"7.760","high":"7.950","low":"7.730","volume":1938691,"amount":1524752765,"code":"600016","ticktime":"15:00:00"},{"symbol":"sh600017","name":"日照港","trade":"4.120","pricechange":"-0.080","changepercent":"-1.905","buy":"4.110","sell":"4.120","settlement":"4.200","open":"4.190","high":"4.200","low":"4.110","volume":210869,"amount":87547357,"code":"600017","ticktime":"15:00:00"},{"symbol":"sh600018","name":"上港集团","trade":"6.190","pricechange":"0.070","changepercent":"1.144","buy":"6.180","sell":"6.190","settlement":"6.120","open":"6.100","high":"6.200","low":"6.030","volume":390837,"amount":239766481,"code":"600018","ticktime":"15:00:00"},{"symbol":"sh600019","name":"宝钢股份","trade":"6.280","pricechange":"0.130","changepercent":"2.114","buy":"6.270","sell":"6.280","settlement":"6.150","open":"6.160","high":"6.310","low":"6.130","volume":1020151,"amount":638297086,"code":"600019","ticktime":"15:00:00"},{"symbol":"sh600020","name":"中原高速","trade":"4.700","pricechange":"-0.030","changepercent":"-0.634","buy":"4.700","sell":"4.710","settlement":"4.730","open":"4.730","high":"4.760","low":"4.680","volume":115580,"amount":54556122,"code":"600020","ticktime":"15:00:00"},{"symbol":"sh600021","name":"上海电力","trade":"12.800","pricechange":"-0.070","changepercent":"-0.544","buy":"12.790","sell":"12.800","settlement":"12.870","open":"12.860","high":"12.860","low":"12.450","volume":141210,"amount":178943030,"code":"600021","ticktime":"15:00:00"},{"symbol":"sh600022","name":"山东钢铁","trade":"2.540","pricechange":"-0.020","changepercent":"-0.781","buy":"2.540","sell":"2.550","settlement":"2.560","open":"2.550","high":"2.570","low":"2.520","volume":486355,"amount":123720231,"code":"600022","ticktime":"15:00:00"},{"symbol":"sh600023","name":"浙能电力","trade":"5.650","pricechange":"0.060","changepercent":"1.073","buy":"5.650","sell":"5.660","settlement":"5.590","open":"5.540","high":"5.660","low":"5.500","volume":409195,"amount":229054013,"code":"600023","ticktime":"15:00:00"},{"symbol":"sh600026","name":"中远海能","trade":"6.090","pricechange":"-0.050","changepercent":"-0.814","buy":"6.080","sell":"6.090","settlement":"6.140","open":"6.140","high":"6.160","low":"6.080","volume":107497,"amount":65716706,"code":"600026","ticktime":"15:00:00"},{"symbol":"sh600027","name":"华电国际","trade":"4.730","pricechange":"-0.040","changepercent":"-0.839","buy":"4.730","sell":"4.740","settlement":"4.770","open":"4.750","high":"4.780","low":"4.710","volume":105643,"amount":50068410,"code":"600027","ticktime":"15:00:00"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * totalCount : 1248
         * page : 1
         * num : 20
         * data : [{"symbol":"sh600000","name":"浦发银行","trade":"15.430","pricechange":"0.390","changepercent":"2.593","buy":"15.420","sell":"15.430","settlement":"15.040","open":"15.000","high":"15.570","low":"14.980","volume":754004,"amount":1154524439,"code":"600000","ticktime":"15:00:00"},{"symbol":"sh600004","name":"白云机场","trade":"16.430","pricechange":"-0.580","changepercent":"-3.410","buy":"16.410","sell":"16.420","settlement":"17.010","open":"16.880","high":"16.900","low":"16.210","volume":346914,"amount":572501954,"code":"600004","ticktime":"15:00:00"},{"symbol":"sh600006","name":"东风汽车","trade":"5.600","pricechange":"-0.190","changepercent":"-3.282","buy":"5.600","sell":"5.610","settlement":"5.790","open":"5.760","high":"5.790","low":"5.570","volume":107653,"amount":61041079,"code":"600006","ticktime":"15:00:00"},{"symbol":"sh600007","name":"中国国贸","trade":"20.390","pricechange":"-0.230","changepercent":"-1.115","buy":"20.300","sell":"20.390","settlement":"20.620","open":"20.620","high":"20.620","low":"19.900","volume":14852,"amount":30025481,"code":"600007","ticktime":"15:00:00"},{"symbol":"sh600008","name":"首创股份","trade":"7.060","pricechange":"-0.690","changepercent":"-8.903","buy":"7.040","sell":"7.050","settlement":"7.750","open":"7.660","high":"7.830","low":"6.980","volume":3660301,"amount":2715023085,"code":"600008","ticktime":"15:00:00"},{"symbol":"sh600009","name":"上海机场","trade":"40.150","pricechange":"0.330","changepercent":"0.829","buy":"40.150","sell":"40.160","settlement":"39.820","open":"39.510","high":"40.160","low":"38.010","volume":145912,"amount":572764710,"code":"600009","ticktime":"15:00:00"},{"symbol":"sh600010","name":"包钢股份","trade":"2.960","pricechange":"0.030","changepercent":"1.024","buy":"2.950","sell":"2.960","settlement":"2.930","open":"2.930","high":"2.960","low":"2.890","volume":665942,"amount":194759922,"code":"600010","ticktime":"15:00:00"},{"symbol":"sh600011","name":"华能国际","trade":"7.660","pricechange":"-0.140","changepercent":"-1.795","buy":"7.660","sell":"7.670","settlement":"7.800","open":"7.730","high":"7.920","low":"7.650","volume":137495,"amount":106802945,"code":"600011","ticktime":"15:00:00"},{"symbol":"sh600012","name":"皖通高速","trade":"12.290","pricechange":"-0.190","changepercent":"-1.522","buy":"12.290","sell":"12.300","settlement":"12.480","open":"12.480","high":"12.660","low":"12.180","volume":28978,"amount":35841247,"code":"600012","ticktime":"15:00:00"},{"symbol":"sh600015","name":"华夏银行","trade":"10.400","pricechange":"0.150","changepercent":"1.463","buy":"10.400","sell":"10.410","settlement":"10.250","open":"10.230","high":"10.510","low":"10.230","volume":388437,"amount":403434544,"code":"600015","ticktime":"15:00:00"},{"symbol":"sh600016","name":"民生银行","trade":"7.890","pricechange":"0.120","changepercent":"1.544","buy":"7.880","sell":"7.890","settlement":"7.770","open":"7.760","high":"7.950","low":"7.730","volume":1938691,"amount":1524752765,"code":"600016","ticktime":"15:00:00"},{"symbol":"sh600017","name":"日照港","trade":"4.120","pricechange":"-0.080","changepercent":"-1.905","buy":"4.110","sell":"4.120","settlement":"4.200","open":"4.190","high":"4.200","low":"4.110","volume":210869,"amount":87547357,"code":"600017","ticktime":"15:00:00"},{"symbol":"sh600018","name":"上港集团","trade":"6.190","pricechange":"0.070","changepercent":"1.144","buy":"6.180","sell":"6.190","settlement":"6.120","open":"6.100","high":"6.200","low":"6.030","volume":390837,"amount":239766481,"code":"600018","ticktime":"15:00:00"},{"symbol":"sh600019","name":"宝钢股份","trade":"6.280","pricechange":"0.130","changepercent":"2.114","buy":"6.270","sell":"6.280","settlement":"6.150","open":"6.160","high":"6.310","low":"6.130","volume":1020151,"amount":638297086,"code":"600019","ticktime":"15:00:00"},{"symbol":"sh600020","name":"中原高速","trade":"4.700","pricechange":"-0.030","changepercent":"-0.634","buy":"4.700","sell":"4.710","settlement":"4.730","open":"4.730","high":"4.760","low":"4.680","volume":115580,"amount":54556122,"code":"600020","ticktime":"15:00:00"},{"symbol":"sh600021","name":"上海电力","trade":"12.800","pricechange":"-0.070","changepercent":"-0.544","buy":"12.790","sell":"12.800","settlement":"12.870","open":"12.860","high":"12.860","low":"12.450","volume":141210,"amount":178943030,"code":"600021","ticktime":"15:00:00"},{"symbol":"sh600022","name":"山东钢铁","trade":"2.540","pricechange":"-0.020","changepercent":"-0.781","buy":"2.540","sell":"2.550","settlement":"2.560","open":"2.550","high":"2.570","low":"2.520","volume":486355,"amount":123720231,"code":"600022","ticktime":"15:00:00"},{"symbol":"sh600023","name":"浙能电力","trade":"5.650","pricechange":"0.060","changepercent":"1.073","buy":"5.650","sell":"5.660","settlement":"5.590","open":"5.540","high":"5.660","low":"5.500","volume":409195,"amount":229054013,"code":"600023","ticktime":"15:00:00"},{"symbol":"sh600026","name":"中远海能","trade":"6.090","pricechange":"-0.050","changepercent":"-0.814","buy":"6.080","sell":"6.090","settlement":"6.140","open":"6.140","high":"6.160","low":"6.080","volume":107497,"amount":65716706,"code":"600026","ticktime":"15:00:00"},{"symbol":"sh600027","name":"华电国际","trade":"4.730","pricechange":"-0.040","changepercent":"-0.839","buy":"4.730","sell":"4.740","settlement":"4.770","open":"4.750","high":"4.780","low":"4.710","volume":105643,"amount":50068410,"code":"600027","ticktime":"15:00:00"}]
         */

        private String totalCount;
        private String page;
        private String num;
        private List<DataBean> data;

        public String getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(String totalCount) {
            this.totalCount = totalCount;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * symbol : sh600000
             * name : 浦发银行
             * trade : 15.430
             * pricechange : 0.390
             * changepercent : 2.593
             * buy : 15.420
             * sell : 15.430
             * settlement : 15.040
             * open : 15.000
             * high : 15.570
             * low : 14.980
             * volume : 754004
             * amount : 1154524439
             * code : 600000
             * ticktime : 15:00:00
             */

            private String symbol;
            private String name;
            private String trade;
            private String pricechange;
            private String changepercent;
            private String buy;
            private String sell;
            private String settlement;
            private String open;
            private String high;
            private String low;
            private int volume;
            private int amount;
            private String code;
            private String ticktime;

            public String getSymbol() {
                return symbol;
            }

            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTrade() {
                return trade;
            }

            public void setTrade(String trade) {
                this.trade = trade;
            }

            public String getPricechange() {
                return pricechange;
            }

            public void setPricechange(String pricechange) {
                this.pricechange = pricechange;
            }

            public String getChangepercent() {
                return changepercent;
            }

            public void setChangepercent(String changepercent) {
                this.changepercent = changepercent;
            }

            public String getBuy() {
                return buy;
            }

            public void setBuy(String buy) {
                this.buy = buy;
            }

            public String getSell() {
                return sell;
            }

            public void setSell(String sell) {
                this.sell = sell;
            }

            public String getSettlement() {
                return settlement;
            }

            public void setSettlement(String settlement) {
                this.settlement = settlement;
            }

            public String getOpen() {
                return open;
            }

            public void setOpen(String open) {
                this.open = open;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public int getVolume() {
                return volume;
            }

            public void setVolume(int volume) {
                this.volume = volume;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTicktime() {
                return ticktime;
            }

            public void setTicktime(String ticktime) {
                this.ticktime = ticktime;
            }
        }
    }
}
