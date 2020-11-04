package com.jjc.util.sysutil;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能菜单树结构
 * @Title:
 * @Description:
 * @Company:
 * @Author:yctong
 * @Created Date:2020年4月23日
 */
public class FunTreeUtil {

	/**
	 * id
	 */
	private Long id;

	/**
	 * 上级编码
	 */
	private Long parentFunId;

	/**
	 * 名称
	 */
	private String funName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 序号
	 */
	private Integer orderNo;

	/**
	 * 是否菜单
	 */
	private Byte isMenu;

	/**
	 * 类型
	 */
	private Byte type;

	/**
	 * 是否删除
	 */
	private Byte isDelete;

	private List<FunTreeUtil> children = new ArrayList<FunTreeUtil>();

	/******** setter and getter **********/

	public static List<FunTreeUtil> formatTree(List<FunTreeUtil> list) {

		FunTreeUtil root = new  FunTreeUtil();
		 FunTreeUtil node = new  FunTreeUtil();
		List< FunTreeUtil> treelist = new ArrayList< FunTreeUtil>();// 拼凑好的json格式的数据
		List< FunTreeUtil> parentnodes = new ArrayList<FunTreeUtil>();// parentnodes存放所有的父节点

		if (list != null && list.size() > 0) {
			root = list.get(0);
			// 循环遍历oracle树查询的所有节点
			for (int i = 1; i < list.size(); i++) {
				node = list.get(i);
				if (node.getParentFunId().equals(root.getId())) {
					// 为tree root 增加子节点
					parentnodes.add(node);
					root.getChildren().add(node);
				} else {// 获取root子节点的孩子节点
					getChildrenNodes(parentnodes, node);
					parentnodes.add(node);
				}
			}
		}
		treelist.add(root);
		return treelist;

	}

	private static void getChildrenNodes(List<FunTreeUtil> parentnodes, FunTreeUtil node) {
		// 循环遍历所有父节点和node进行匹配，确定父子关系
		for (int i = parentnodes.size() - 1; i >= 0; i--) {

			FunTreeUtil pnode = parentnodes.get(i);
			// 如果是父子关系，为父节点增加子节点，退出for循环
			if (pnode.getId().equals(node.getParentFunId())) {
				pnode.getChildren().add(node);
				return;
			} else {
				// 如果不是父子关系，删除父节点栈里当前的节点，
				// 继续此次循环，直到确定父子关系或不存在退出for循环
				// parentnodes.remove(i);
			}
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentFunId() {
		return parentFunId;
	}

	public void setParentFunId(Long parentFunId) {
		this.parentFunId = parentFunId;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Byte getIsMenu() {
		return isMenu;
	}

	public void setIsMenu(Byte isMenu) {
		this.isMenu = isMenu;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Byte isDelete) {
		this.isDelete = isDelete;
	}

	public List<FunTreeUtil> getChildren() {
		return children;
	}

	public void setChildren(List<FunTreeUtil> children) {
		this.children = children;
	}
}
