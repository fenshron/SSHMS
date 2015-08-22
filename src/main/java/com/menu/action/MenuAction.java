package com.menu.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.menu.model.Menu;
import com.menu.service.MenuService;
import com.menu.service.RepairServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

import framework.base.action.BaseAction;


@ParentPackage("basePackage")
@Namespace("/")
@Action(value="menuAction")
public class MenuAction extends BaseAction implements ModelDriven<Menu>{

	private MenuService menuService;

	private Menu menu = new Menu();
	
	private RepairServiceImpl repairService;

	public RepairServiceImpl getRepairService() {
		return repairService;
	}

	public void setRepairService(RepairServiceImpl repairService) {
		this.repairService = repairService;
	}

	/*
	 * 一次加载树所有节点，这里用的表对象是Tmenu
	 */
	public void getAllTreeNode() {				
		super.writeJson(menuService.getAllTreeNode());
	}
	
	/**
	 * 异步获取树节点
	 */
	public void getTreeNode() {
		super.writeJson(menuService.getTreeNode(menu.getId()));
	}
	
	/*
	 * 一次加载树所有节点
	 */
	public void getTreeMenu(){
		super.writeJson(menuService.getTreeMenu());
	}

	
	public MenuService getMenuService() {
		return menuService;
	}

	
	@Autowired
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	@Override
	public Menu getModel() {
		
		return menu;
	}

}
