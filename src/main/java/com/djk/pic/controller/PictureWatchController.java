package com.djk.pic.controller;

import com.djk.pic.service.PictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 观察当前每台服务器缓存队列的数量
 * 
 * @author dujinkai
 *
 */
@Controller
public class PictureWatchController {

	/**
	 * 注入图片服务接口
	 */
	@Resource
	private PictureService pictureService;

	@RequestMapping("watch")
	@ResponseBody
	public String watch() {
		return pictureService.getAllPicServerInfo();
	}

}