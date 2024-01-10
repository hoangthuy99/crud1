package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.GeneratedValue;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String category(Model model) {
        List<Category> list = categoryService.findAll();
        //Chuyển list sang view
        model.addAttribute("list", list);
        return "category";
    }

    @GetMapping("/add-cat")
    public String add(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "add-cat";
    }

    @PostMapping("/post-cat")
    public String save(@ModelAttribute("category") Category category) {
        categoryService.saveOrUpdate(category);
        return "redirect:/category";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, RedirectAttributes redirectAttrs) {
        categoryService.delete(Integer.parseInt(id));
        redirectAttrs.addFlashAttribute("success", "Xóa thành công");
        return "redirect:/category";
    }
    @GetMapping("/edit-cat/{id}")
    public String edit(@PathVariable Integer id,Model model) {
        Category category = categoryService.findById(id);
        model.addAttribute("category", category);
        return "edit-cat";
    }

    @PostMapping(value = "/update-cat")
    public String update(@ModelAttribute("category") Category category,RedirectAttributes redirectAttrs) {
        if(categoryService.saveOrUpdate(category)) {
            redirectAttrs.addFlashAttribute("success", "Cập nhật thành công");
            return "redirect:/category";
        }
        return "redirect:/category";
    }

}
