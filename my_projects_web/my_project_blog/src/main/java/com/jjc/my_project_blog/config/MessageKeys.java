package com.jjc.my_project_blog.config;

public class MessageKeys {

	// 需要登录
	public static final String NEED_LOGIN = "need.login";

	// 请输入{0}
	public static final String PLEASE_INPUT = "please.input";

	// 系统繁忙
	public static final String SYS_ERROR_BUSY = "system.error.busy";

	// 系统错误
	public static final String SYS_ERROR = "system.error";

	//没有md5
	public static final String PARAM_ERROR_md5="param.error.md5";

	// 没有相数据
	public static final String NO_DATA = "no_data";

	// 没有权限
	public static final String UNAUTHORIZED = "unauthorized";

	// 用户被禁用或冻结
	public static final String USER_STATUS_DISABLE = "user.status.disable";

	// {0}字段不能为空，请输入正确值！
	public static final String FIELD_VALID_NOTNULL = "不能为空，请输入正确值！";

	// {0}字段长度不能超过{1}个字符，请重新输入！
	public static final String FIELD_VALID_EXCEED = "field.valid.exceed";

	// 请求成功！
	public static final String SYSTEM_SUCCESS = "system.success";

	// 参数异常！
	public static final String SYS_PARAM_ERROR = "system.param.error";

	// 图形验证码创建失败
	public static final String CHECK_CODE_CREATE_FAIL = "check.code.create.fail";

	// 消息服务器发送错误
	public static final String MESSAGE_SEND_ERROR = "message.send.error";

	// 图形验证码错误
	public static final String CHECK_CODE_ERROR = "check.code.error";

	// 用户名或密码不能为空
	public static final String USER_PASSWORD_NOT_NULL = "user.password.not.null";

	// 导入文件格式错误
	public static final String FILE_FORMAT_ERROR = "file.format.error";

	// 导入文件信息不完整
	public static final String FILE_INFO_INCOMPLETE = "file.info.incomplete";


	/******************************** 拼团相关 **********************************/
	// 开始日期不能大于结束日期
	public static final String START_DATE_NOTBIG = "start.date.notbig";
	// 开始日期不能为空
	public static final String START_DATE_NOTNULL = "start.date.notnull";
	// 结束日期不能为空
	public static final String END_DATE_NOTNULL = "end.date.notnull";
	// 商品id不能为空，提示信息：请选择商品
	public static final String PRODUCT_ID_NOTNULL = "product.id.notnull";
	// 拼团分组id不能为空，提示信息：请选择拼团分组
	public static final String SPELL_GROUP_ID_NOTNULL = "spell.group.id.notnull";
	// 拼团价格不能为空，提示信息：请填写拼团的价格
	public static final String SPELL_PRICE_NOTNULL = "spell.price.notnull";
	// 拼团活动id不能为空，提示信息：找不到该拼团活动
	public static final String SPELL_ACTIVE_ID_NOTFIND = "spell.active.id.notfind";
	// 拼团商品id不能为空，提示信息：找不到该拼团商品
	public static final String SPELL_PRODUCT_ID_NOTFIND = "spell.product.id.notfind";


	/******************************** 商品分类 **********************************/
	// 找不到该商品分类
	public static final String PRODUCT_CLASS_NOTFIND = "product.class.notfind";
	// 商品分类名称不能为空
	public static final String PRODUCT_CLASS_NAME_NOTNULL = "product.class.name.notnull";


	/******************************** 订单相关 **********************************/
	// 找不到该笔订单
	public static final String ORDER_ID_NOTFIND = "order.id.notfind";
	// 找不到该物流订单
	public static final String ORDER_LOGISTICS_ID_NOTFIND = "order.logistics.id.notfind";
	// 物流公司名称不能为空
	public static final String ORDER_LOGISTICS_COMPANY_NAME_NOTNULL = "order.logistics.company.name.notnull";
	// 物流编号不能为空
	public static final String ORDER_LOGISTICS_NUMBER_NOTNULL = "order.logistics.number.notnull";
	// 物流公司类型不能为空
	public static final String ORDER_LOGISTICS_COMPANY_IDEN_NOTNULL = "order.logistics.company.iden.notnull";

	// 订单收货地址id不能为空
	public static final String ORDER_ADDRESS_ID_NOTNULL = "order.address.id.notnull";

	// 未选择活动
	public static final String RED_ACTIVE_NOT_SELECT = "red.active.not.select";
	// 未选择商品
	public static final String RED_PRODUCT_NOT_SELECT = "red.product.not.select";
	// 活动类型不正确
	public static final String RED_ACTIVE_TYPE_WRONG = "red.active.type.wrong";
	// 请选择活动类型
	public static final String RED_ACTIVE_TYPE_NOTNULL = "red.active.type.notnull";

	//无法获取文件锁拥有者
	public static final String UNABLE_TO_OBTAIN_FILE_LOCK_OWNER="unable.to.obtain.file.lock.owner";

	//无法获取当前文件chunkCurr
	public static final String NOT_GET_CURRENT_FILE_CHUNKCURR="not.get.current.file.chunkcurr";

	//当前文件已存在
	public static final String REPEAT_UPLOAD="repeat.upload";

	//稍后上传
	public static final String WAIT_A_MOMENT="wait.a.moment";

	//获取远程文件路径出错
	public static final String ERROR_GETTING_REMOTE_FILE_PATH="error.getting.remote.file.path";

	//初次上传远程文件出错
	public static final String FILE_FOR_THE_FIRST_TIME_ERROR="file.for.the.first.time.error";

	//无法获取上传远程服务器文件出错
	public static final String UPLOADED_REMOTE_SERVER_FILE_ERROR="uploaded.remote.server.file.error";

	//更新远程文件出错
	public static final String ERROR_UPDATING_REMOTE_FILE="error.updating.remote.file";

	//上传文件错误
	public static final String ERROR_UPLOADING_FILE="error.uploading.file";

	//消息发送失败
    public static final String SOCKET_SEND_ERROR = "error.websocket.send";
}
