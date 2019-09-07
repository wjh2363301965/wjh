package birthday;

/*
 * 出生日期类
 */
public class Birthday {
    private int year;

    private int month;
    private int day;


    public Birthday(int year, int month, int day) {
        //必须是合法的日期才能赋值, 年不能是零
        if (year != 0 && day != 0 && month != 0) {
            this.day = day;
            this.month = month;
            this.year = year;

        }

    }

    //判断闰年
    public boolean isLeap() {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    //返回制定年月的最后一天
    //一、三、五、七、八、十、十二月定为大月，每月31天；2 4 6 9 11定为小月。
    public int getLastDay() {
        int lastDay = 0;
        if (isLeap() && month == 2) {
            lastDay = 29;
        }
        if (isLeap() == false && month == 2) {
            lastDay = 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            lastDay = 30;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            lastDay = 31;
        }


        return lastDay;


    }

    //返回当前日期年月日，形成一个YYYY-mm-dd格式 如果日期不是合法的直接返回null

    public String getDate() {
        //返回上一个方法来判断这个月是不是有31天
        int a = getLastDay();
        System.out.println("本月有" + a + "天");
        if (a == 31) {
            if (year != 0 && month > 0 && month < 13 && day > 0 && day < 32) {
                return "" + year + "-" + month + "-" + day;
            } else {
                return null;
            }
        } else if (a == 30) {
            if (year != 0 && month > 0 && month < 13 && day > 0 && day < 31) {
                return "" + year + "-" + month + "-" + day;
            } else {
                return null;
            }

        } else if (a == 29) {
            if (year != 0 && month == 2 && day > 0 && day < 30) {
                return "" + year + "-" + month + "-" + day;
            } else {
                return null;
            }
        } else if (a == 28) {
            if (year != 0 && month == 2 && day > 0 && day < 29) {
                return "" + year + "-" + month + "-" + day;
            } else {
                return null;
            }
        }
        return null;
    }

    //返回当前日期的下一天
    public String getNextDate() {
        //设定一个局部变量，因为不能修改成员
        int year2 = year;
        int month2 = month;
        int day2 = day;
        //先判断是不是本月有31号
        int a = getLastDay();
        if (a == 31) {
            //证明本月是大月，再判断当前日期是不是31号
            if (day == 31) {
                //在判断当前月是不是12月
                if (month == 12) {
                    year2++;
                    return "" + year2 + "-01-01";
                } else if (month > 0 && month < 12) {
                    //如果不是12月
                    month2++;
                    return "" + year2 + "-" + month2 + "-01";
                }
            }
            day2++;
            return "" + year2 + "-" + month2 + "-" + day2;

        } else if (a == 30) {
            //a == 30证明是小月，不用加年最多加月就ok
            if (day2 == 30) {
                month2++;
                return "" + year2 + "-" + month2 + "-01";
            } else if (day2 > 0 && day2 < 30) {
                day2++;
                return "" + year2 + "-" + month2 + "-" + day2;
            }
        } else if (a == 29) {
            if (day2 == 29) {
                month2++;
                return "" + year2 + "-" + month2 + "-01";
            } else if (day2 > 0 && day2 < 29) {
                day2++;
                return "" + year2 + "-" + month2 + "-" + day2;
            }
        } else if (a == 28) {
            if (day2 == 28) {
                month2++;
                return "" + year2 + "-" + month2 + "-01";
            } else if (day2 > 0 && day2 < 28) {
                day2++;
                return "" + year2 + "-" + month2 + "-" + day2;
            }
        }
        return "您输入的日期不正确";
    }

    //返回当前日期的上一天

    public String getPrevDate() {
        //设定一个局部变量，因为不能修改成员
        int year2 = year;
        int month2 = month;
        int day2 = day;
        //
        boolean leap = isLeap();
        int lastDay = getLastDay();


        if (month2 == 3 && day2 == 1) {
            //判断是不是闰年
            if (leap) {
                //如果是
                return "" + year2 + "-02-29";
            } else  {
                return "" + year2 + "-02-28";
            }

        } else if ((month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12 )&&day2==1) {
            month2--;
            return "" + year2 + "-" + month2 + "-" + 31;
        } else if ((month2 == 2 || month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) && day2 == 1) {
            month2--;
            return "" + year2 + "-" + month2 + "-" + 30;
        } else if (month2 == 1 && day2 == 1) {
            year2--;
            return "" + year2 + "-" + month2 + "-" + 31;
        } else if (day2 > 1 && day2 <= lastDay) {
            day2--;
            return "" + year2 + "-" + month2 + "-" + day2;
        }


        return "您输入的日期不正确";
    }

    public static void main(String[] args) {

        Birthday date = new Birthday(2003, 3, 1);
        String date1 = date.getPrevDate();
        System.out.println(date1);


    }

}