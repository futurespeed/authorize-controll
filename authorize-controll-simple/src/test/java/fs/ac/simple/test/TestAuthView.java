package fs.ac.simple.test;

import fs.ac.api.AuthorizeView;

import static fs.ac.api.AuthorizeView.FieldType.*;

@AuthorizeView
public class TestAuthView {
    private String id;
    @AuthorizeView.Field(name = "名称", order = 1)
    private String name;
    @AuthorizeView.Field(name = "状态", desc = "正在流转的状态", order = 2)
    private String state;
    @AuthorizeView.Field(name = "描述", type = TEXT_AREA, order = 3)
    private String desc;
}
