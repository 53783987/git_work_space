package gupao.edu.pattern.factory.service.impl.ali;


import gupao.edu.pattern.factory.service.ICloundDiskLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:23
 */
public class AliCloundDiskLoad implements ICloundDiskLoad {
    @Override
    public void upload() {
        System.out.println("ali colundDisk 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("ali colundDisk 文件下载成功");
    }
}
