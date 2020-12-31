package com.jjc.my_project_blog.config;



/**
 * 返回码定义
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2018年5月10日
 */
public class RestRespCode {

	// 成功
	public static final String  SUCCESS= "0000";
	// 需要登录
	public static final String NEED_LOGIN = "SHOP10000";

	// 系统繁忙
	public static final String SYS_BUSY = "SHOP10001";

	// 系统错误
	public static final String SYS_ERROR = "SHOP10002";

	//没有查到相关数据
	public static final String NO_DATA ="SHOP13002";

	// 参数错误
	public static final String PARAM_ERROR = "SHOP10003";

	//md5不为空
	public static final String PARAM_ERROR_md5 = "SHOP100033";

	// 没有权限
	public static final String UNAUTHORIZED = "SHOP10004";

	// token验证失败
	public static final String INVALID_ACCESS_TOKEN = "SHOP10005";

	// 操作失败
	public static final String OPERATION_FAIL = "SHOP10006";

	// 用户名或密码不能为空
	public static final String USER_PASSWORD_NOT_NULL = "SHOP10013";

	// 用户不存在
	public static final String USER_NOT_EXIT = "SHOP20007";

	// 用户userID不能为空
	public static final String USER_ID_NOT_NULL = "SHOP10015";

	// 秘钥不能为空
	public static final String VERIFY_TOKEN_NOT_NULL = "SHOP10016";

	// 刷新密码不能为空
	public static final String REFRESH_TOKEN_NOT_NULL = "SHOP10017";

	// 刷新密码不能错误
	public static final String REFRESH_TOKEN_ERROR = "SHOP10018";

	// 图形验证码创建失败
	public static final String CHECK_CODE_CREATE_FAIL = "SHOP10020";

	// 图形验证码错误
	public static final String CHECK_CODE_ERROR = "SHOP10022";

	// 导入文件格式错误
	public static final String FILE_FORMAT_ERROR = "SHOP10024";

	// 导入文件信息不完整
	public static final String FILE_INFO_INCOMPLETE = "SHOP10024";

	//无法获取文件锁拥有者
	public static final String UNABLE_TO_OBTAIN_FILE_LOCK_OWNER="SHOP16024";

	//无法获取当前文件chunkCurr
	public static final String NOT_GET_CURRENT_FILE_CHUNKCURR="SHOP16025";

	//文件已存在
	public static final String REPEAT_UPLOAD ="SHOP16026";

	//稍后上传
	public static final String WAIT_A_MOMENT="SHOP16027";

	//获取远程文件路径出错
	public static final String ERROR_GETTING_REMOTE_FILE_PATH="SHOP16030";

	//初次上传远程文件出错
	public static final String FILE_FOR_THE_FIRST_TIME_ERROR="SHOP16031";

	//无法获取上传远程服务器文件出错
	public static final String UPLOADED_REMOTE_SERVER_FILE_ERROR="SHOP16032";

	//更新远程文件出错
	public static final String ERROR_UPDATING_REMOTE_FILE="SHOP16033";

	//上传文件错误
	public static final String ERROR_UPLOADING_FILE="SHOP16034";

	// WebSocket 发送失败
	public static final String SOCKET_SEND_ERROR = "SHOP14600";
}
