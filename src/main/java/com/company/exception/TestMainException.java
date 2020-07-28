package com.company.exception;

import java.io.IOException;

public class TestMainException  {
    public static void main(String[] args) {
        try {
            System.out.println(A.A());
        } catch (CException e) {
            System.out.println(e.getMessage());
            // return new AjaxResult(Status.STATUS_ERROR_UNKNOWN, i18nController.getMessage("approval.error"));
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static class A {
        static class B {
            public static boolean B() throws CException, Exception {

                //                int i = 1/0;
                // 业务代码
                if (1 != 1) {
                    throw new CException("流程异常");
                }
                if (1 == 1) {
                    throw new IOException("io error");
                }

                // 业务代码结束
                return true;
            }
        }

        public static String A() throws Exception {
            if (B.B()) {
                return "true";
            } else {
                return "false";
            }
        }
    }

    static class CException extends Exception {

        public CException(String message) {
            super(message);
        }
    }
}
