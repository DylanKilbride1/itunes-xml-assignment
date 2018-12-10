package com.dylankilbride.itunesbackup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class HomepageController {

	public static final String UPLOAD_FOLDER = "/Users/dylan.kilbride/Development/ItunesBackupAssignment";

	@RequestMapping(value = "/user_home", method = RequestMethod.GET)
	public String getUserHomepage() {
		return "user_home";
	}

	@RequestMapping(value = "/user_home", method = RequestMethod.POST)
	public String uploadItunesBackupFile(@RequestParam("file") MultipartFile multipartFile, RedirectAttributes redirectAttributes) {
		if (multipartFile.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:uploadStatus";
		}

		try {

			// Get the file and save it somewhere
			byte[] bytes = multipartFile.getBytes();
			Path path = Paths.get(UPLOAD_FOLDER + multipartFile.getOriginalFilename());
			Files.write(path, bytes);

			redirectAttributes.addFlashAttribute("message",
							"You successfully uploaded '" + multipartFile.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "redirect:/uploadStatus";
	}
}
