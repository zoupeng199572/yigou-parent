package cn.itsource.aigou.utils;

public class AjaxResult {

    private boolean success = true; //默认为true
    private String message;
    private String errorCode;//错误码
    private Object data;//AjaxResult中封装数据

    /**
     * 链式操作（每一个参数的set方法都返回AjaxResult）
     *
     * 成功的话直接调用
     * AjaxResult.me()
     * 失败
     * AjaxResult.me().setSuccess(false).setMessage("输入失败后的消息")
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }


    /**
     * 操作成功后的回调
     * @return
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }
}
