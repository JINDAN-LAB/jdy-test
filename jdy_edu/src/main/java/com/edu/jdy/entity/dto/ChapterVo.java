package com.edu.jdy.entity.dto;

import com.edu.jdy.entity.EduChapterTest;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "章节信息")
@Data
public class ChapterVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private List<EduChapterTest> eduChapterTest;
    private List<VideoVo> children = new ArrayList<>();


}