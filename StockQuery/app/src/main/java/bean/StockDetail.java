package bean;

import java.util.List;

/**
 * Created by guquanding on 2017/5/23.
 * 由GsonFormat 生成
 * 沪深股市
 */

public class StockDetail {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"buyFive":"90500","buyFivePri":"10.490","buyFour":"169700","buyFourPri":"10.500","buyOne":"123400","buyOnePri":"10.530","buyThree":"72600","buyThreePri":"10.510","buyTwo":"322100","buyTwoPri":"10.520","competitivePri":"10.530","date":"2017-05-24","gid":"sh601009","increPer":"-0.19","increase":"-0.020","name":"南京银行","nowPri":"10.520","reservePri":"10.540","sellFive":"190400","sellFivePri":"10.580","sellFour":"90900","sellFourPri":"10.570","sellOne":"67200","sellOnePri":"10.540","sellThree":"191300","sellThreePri":"10.560","sellTwo":"155842","sellTwoPri":"10.550","time":"15:00:00","todayMax":"10.600","todayMin":"10.390","todayStartPri":"10.560","traAmount":"399491361.000","traNumber":"380821","yestodEndPri":"10.540"},"dapandata":{"dot":"10.520","name":"南京银行","nowPic":"-0.020","rate":"-0.19","traAmount":"39949","traNumber":"380821"},"gopicture":{"minurl":"http://image.sinajs.cn/newchart/min/n/sh601009.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh601009.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh601009.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh601009.gif"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : {"buyFive":"90500","buyFivePri":"10.490","buyFour":"169700","buyFourPri":"10.500","buyOne":"123400","buyOnePri":"10.530","buyThree":"72600","buyThreePri":"10.510","buyTwo":"322100","buyTwoPri":"10.520","competitivePri":"10.530","date":"2017-05-24","gid":"sh601009","increPer":"-0.19","increase":"-0.020","name":"南京银行","nowPri":"10.520","reservePri":"10.540","sellFive":"190400","sellFivePri":"10.580","sellFour":"90900","sellFourPri":"10.570","sellOne":"67200","sellOnePri":"10.540","sellThree":"191300","sellThreePri":"10.560","sellTwo":"155842","sellTwoPri":"10.550","time":"15:00:00","todayMax":"10.600","todayMin":"10.390","todayStartPri":"10.560","traAmount":"399491361.000","traNumber":"380821","yestodEndPri":"10.540"}
         * dapandata : {"dot":"10.520","name":"南京银行","nowPic":"-0.020","rate":"-0.19","traAmount":"39949","traNumber":"380821"}
         * gopicture : {"minurl":"http://image.sinajs.cn/newchart/min/n/sh601009.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh601009.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh601009.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh601009.gif"}
         */

        private DataBean data;
        private DapandataBean dapandata;
        private GopictureBean gopicture;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public DapandataBean getDapandata() {
            return dapandata;
        }

        public void setDapandata(DapandataBean dapandata) {
            this.dapandata = dapandata;
        }

        public GopictureBean getGopicture() {
            return gopicture;
        }

        public void setGopicture(GopictureBean gopicture) {
            this.gopicture = gopicture;
        }

        public static class DataBean {
            /**
             * buyFive : 90500
             * buyFivePri : 10.490
             * buyFour : 169700
             * buyFourPri : 10.500
             * buyOne : 123400
             * buyOnePri : 10.530
             * buyThree : 72600
             * buyThreePri : 10.510
             * buyTwo : 322100
             * buyTwoPri : 10.520
             * competitivePri : 10.530
             * date : 2017-05-24
             * gid : sh601009
             * increPer : -0.19
             * increase : -0.020
             * name : 南京银行
             * nowPri : 10.520
             * reservePri : 10.540
             * sellFive : 190400
             * sellFivePri : 10.580
             * sellFour : 90900
             * sellFourPri : 10.570
             * sellOne : 67200
             * sellOnePri : 10.540
             * sellThree : 191300
             * sellThreePri : 10.560
             * sellTwo : 155842
             * sellTwoPri : 10.550
             * time : 15:00:00
             * todayMax : 10.600
             * todayMin : 10.390
             * todayStartPri : 10.560
             * traAmount : 399491361.000
             * traNumber : 380821
             * yestodEndPri : 10.540
             */

            private String buyFive;
            private String buyFivePri;
            private String buyFour;
            private String buyFourPri;
            private String buyOne;
            private String buyOnePri;
            private String buyThree;
            private String buyThreePri;
            private String buyTwo;
            private String buyTwoPri;
            private String competitivePri;
            private String date;
            private String gid;
            private String increPer;
            private String increase;
            private String name;
            private String nowPri;
            private String reservePri;
            private String sellFive;
            private String sellFivePri;
            private String sellFour;
            private String sellFourPri;
            private String sellOne;
            private String sellOnePri;
            private String sellThree;
            private String sellThreePri;
            private String sellTwo;
            private String sellTwoPri;
            private String time;
            private String todayMax;
            private String todayMin;
            private String todayStartPri;
            private String traAmount;
            private String traNumber;
            private String yestodEndPri;

            public String getBuyFive() {
                return buyFive;
            }

            public void setBuyFive(String buyFive) {
                this.buyFive = buyFive;
            }

            public String getBuyFivePri() {
                return buyFivePri;
            }

            public void setBuyFivePri(String buyFivePri) {
                this.buyFivePri = buyFivePri;
            }

            public String getBuyFour() {
                return buyFour;
            }

            public void setBuyFour(String buyFour) {
                this.buyFour = buyFour;
            }

            public String getBuyFourPri() {
                return buyFourPri;
            }

            public void setBuyFourPri(String buyFourPri) {
                this.buyFourPri = buyFourPri;
            }

            public String getBuyOne() {
                return buyOne;
            }

            public void setBuyOne(String buyOne) {
                this.buyOne = buyOne;
            }

            public String getBuyOnePri() {
                return buyOnePri;
            }

            public void setBuyOnePri(String buyOnePri) {
                this.buyOnePri = buyOnePri;
            }

            public String getBuyThree() {
                return buyThree;
            }

            public void setBuyThree(String buyThree) {
                this.buyThree = buyThree;
            }

            public String getBuyThreePri() {
                return buyThreePri;
            }

            public void setBuyThreePri(String buyThreePri) {
                this.buyThreePri = buyThreePri;
            }

            public String getBuyTwo() {
                return buyTwo;
            }

            public void setBuyTwo(String buyTwo) {
                this.buyTwo = buyTwo;
            }

            public String getBuyTwoPri() {
                return buyTwoPri;
            }

            public void setBuyTwoPri(String buyTwoPri) {
                this.buyTwoPri = buyTwoPri;
            }

            public String getCompetitivePri() {
                return competitivePri;
            }

            public void setCompetitivePri(String competitivePri) {
                this.competitivePri = competitivePri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getIncrePer() {
                return increPer;
            }

            public void setIncrePer(String increPer) {
                this.increPer = increPer;
            }

            public String getIncrease() {
                return increase;
            }

            public void setIncrease(String increase) {
                this.increase = increase;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPri() {
                return nowPri;
            }

            public void setNowPri(String nowPri) {
                this.nowPri = nowPri;
            }

            public String getReservePri() {
                return reservePri;
            }

            public void setReservePri(String reservePri) {
                this.reservePri = reservePri;
            }

            public String getSellFive() {
                return sellFive;
            }

            public void setSellFive(String sellFive) {
                this.sellFive = sellFive;
            }

            public String getSellFivePri() {
                return sellFivePri;
            }

            public void setSellFivePri(String sellFivePri) {
                this.sellFivePri = sellFivePri;
            }

            public String getSellFour() {
                return sellFour;
            }

            public void setSellFour(String sellFour) {
                this.sellFour = sellFour;
            }

            public String getSellFourPri() {
                return sellFourPri;
            }

            public void setSellFourPri(String sellFourPri) {
                this.sellFourPri = sellFourPri;
            }

            public String getSellOne() {
                return sellOne;
            }

            public void setSellOne(String sellOne) {
                this.sellOne = sellOne;
            }

            public String getSellOnePri() {
                return sellOnePri;
            }

            public void setSellOnePri(String sellOnePri) {
                this.sellOnePri = sellOnePri;
            }

            public String getSellThree() {
                return sellThree;
            }

            public void setSellThree(String sellThree) {
                this.sellThree = sellThree;
            }

            public String getSellThreePri() {
                return sellThreePri;
            }

            public void setSellThreePri(String sellThreePri) {
                this.sellThreePri = sellThreePri;
            }

            public String getSellTwo() {
                return sellTwo;
            }

            public void setSellTwo(String sellTwo) {
                this.sellTwo = sellTwo;
            }

            public String getSellTwoPri() {
                return sellTwoPri;
            }

            public void setSellTwoPri(String sellTwoPri) {
                this.sellTwoPri = sellTwoPri;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTodayMax() {
                return todayMax;
            }

            public void setTodayMax(String todayMax) {
                this.todayMax = todayMax;
            }

            public String getTodayMin() {
                return todayMin;
            }

            public void setTodayMin(String todayMin) {
                this.todayMin = todayMin;
            }

            public String getTodayStartPri() {
                return todayStartPri;
            }

            public void setTodayStartPri(String todayStartPri) {
                this.todayStartPri = todayStartPri;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }

            public String getYestodEndPri() {
                return yestodEndPri;
            }

            public void setYestodEndPri(String yestodEndPri) {
                this.yestodEndPri = yestodEndPri;
            }
        }

        public static class DapandataBean {
            /**
             * dot : 10.520
             * name : 南京银行
             * nowPic : -0.020
             * rate : -0.19
             * traAmount : 39949
             * traNumber : 380821
             */

            private String dot;
            private String name;
            private String nowPic;
            private String rate;
            private String traAmount;
            private String traNumber;

            public String getDot() {
                return dot;
            }

            public void setDot(String dot) {
                this.dot = dot;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPic() {
                return nowPic;
            }

            public void setNowPic(String nowPic) {
                this.nowPic = nowPic;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }
        }

        public static class GopictureBean {
            /**
             * minurl : http://image.sinajs.cn/newchart/min/n/sh601009.gif
             * dayurl : http://image.sinajs.cn/newchart/daily/n/sh601009.gif
             * weekurl : http://image.sinajs.cn/newchart/weekly/n/sh601009.gif
             * monthurl : http://image.sinajs.cn/newchart/monthly/n/sh601009.gif
             */

            private String minurl;
            private String dayurl;
            private String weekurl;
            private String monthurl;

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getDayurl() {
                return dayurl;
            }

            public void setDayurl(String dayurl) {
                this.dayurl = dayurl;
            }

            public String getWeekurl() {
                return weekurl;
            }

            public void setWeekurl(String weekurl) {
                this.weekurl = weekurl;
            }

            public String getMonthurl() {
                return monthurl;
            }

            public void setMonthurl(String monthurl) {
                this.monthurl = monthurl;
            }
        }
    }
}
