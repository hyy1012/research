<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="企业名称" prop="firmName">
        <el-input
          v-model="queryParams.firmName"
          placeholder="请输入企业名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- <el-form-item label="通讯地址" prop="reAddr">
        <el-input
          v-model="queryParams.reAddr"
          placeholder="请输入通讯地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="邮编" prop="postcode">
        <el-input
          v-model="queryParams.postcode"
          placeholder="请输入邮编"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="负责人" prop="header">
        <el-input
          v-model="queryParams.header"
          placeholder="请输入负责人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="负责人电话" prop="headerPhone">
        <el-input
          v-model="queryParams.headerPhone"
          placeholder="请输入负责人电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联络人" prop="liaison">
        <el-input
          v-model="queryParams.liaison"
          placeholder="请输入联络人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联络人电话" prop="liaisonPhone">
        <el-input
          v-model="queryParams.liaisonPhone"
          placeholder="请输入联络人电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="邮箱" prop="email">
        <el-input
          v-model="queryParams.email"
          placeholder="请输入邮箱"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="微信" prop="wx">
        <el-input
          v-model="queryParams.wx"
          placeholder="请输入微信"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电话" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经营范围" prop="businessScope">
        <el-input
          v-model="queryParams.businessScope"
          placeholder="请输入经营范围"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="员工人数" prop="empCount">
        <el-input
          v-model="queryParams.empCount"
          placeholder="请输入员工人数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否是第八届中国演出行业协会会员单位" prop="isHyxhhy">
        <el-input
          v-model="queryParams.isHyxhhy"
          placeholder="请输入是否是第八届"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否是其他学、协会会员" prop="isHyxhhyOther">
        <el-input
          v-model="queryParams.isHyxhhyOther"
          placeholder="请输入是否是其他学、协会会员"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="协会名称" prop="hyxhhyOtherName">
        <el-input
          v-model="queryParams.hyxhhyOtherName"
          placeholder="请输入协会名称：1、2、3、"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否有证书" prop="hasCertificate">
        <el-input
          v-model="queryParams.hasCertificate"
          placeholder="请输入是否持有中国演出行业协会、演出行业舞美舞台企业专业技术能力等级评价证书"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="证书名称" prop="certificateName">
        <el-input
          v-model="queryParams.certificateName"
          placeholder="请输入证书名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="证书等级" prop="certificateLevel">
        <el-input
          v-model="queryParams.certificateLevel"
          placeholder="请输入证书等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="有效期" prop="certificateIndate">
        <el-date-picker clearable
          v-model="queryParams.certificateIndate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择有效期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="会员需求" prop="memberNeed">
        <el-input
          v-model="queryParams.memberNeed"
          placeholder="请输入会员需求：提供协会政策及政策解读，参与协会研讨、论坛及交流活动，参与产品推荐会，参加竞赛评比、表彰推广，参加企业联谊会，参加技能培训，企业管理咨询，银行金融服务，法律咨询服务，参与标准编写"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="企业公章" prop="firm">
        <el-input
          v-model="queryParams.firm"
          placeholder="请输入企业公章"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="填表人" prop="people">
        <el-input
          v-model="queryParams.people"
          placeholder="请输入填表人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="填表日期" prop="subTime">
        <el-date-picker clearable
          v-model="queryParams.subTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择填表日期">
        </el-date-picker>
      </el-form-item> -->
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <!-- <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['research:research:add']"
        >新增</el-button>
      </el-col> -->
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['research:research:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['research:research:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="info"
          plain
          icon="el-icon-upload2"
          size="mini"
          @click="handleImport"
          v-hasPermi="['system:research:export']"
        >导入</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['research:research:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="researchList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" align="center" prop="id" />
      <el-table-column label="企业名称" align="center" prop="firmName" />
      <el-table-column label="通讯地址" align="center" prop="reAddr" width="200%"/>
      <el-table-column label="邮编" align="center" prop="postcode" />
      <el-table-column label="负责人" align="center" prop="header" />
      <el-table-column label="负责人电话" align="center" prop="headerPhone" />
      <el-table-column label="联络人" align="center" prop="liaison" />
      <el-table-column label="联络人电话" align="center" prop="liaisonPhone" />
      <el-table-column label="邮箱" align="center" prop="email" />
      <el-table-column label="微信" align="center" prop="wx" />
      <el-table-column label="电话" align="center" prop="phone" />
      <el-table-column label="经营范围" align="center" prop="businessScope" width="200%"/>
      <el-table-column label="员工人数" align="center" prop="empCount" />
      <el-table-column label="企业类型" align="center" prop="firmType">
        <template slot-scope="scope">
          <span>{{ types[scope.row.firmType - 1] }}</span>
        </template>
      </el-table-column>
      <!-- <el-table-column label="是否是第八届中国演出行业协会会员单位" align="center" prop="isHyxhhy">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.re_yes_no" :value="scope.row.isHyxhhy"/>
        </template>
      </el-table-column>
      <el-table-column label="是否是其他学、协会会员" align="center" prop="isHyxhhyOther">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.re_yes_no" :value="scope.row.isHyxhhyOther"/>
        </template>
      </el-table-column>
      <el-table-column label="协会名称" align="center" prop="hyxhhyOtherName" /> -->
      <el-table-column label="是否持有证书" align="center" prop="hasCertificate">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.re_yes_no" :value="scope.row.hasCertificate"/>
        </template>
      </el-table-column>
      <el-table-column label="证书名称" align="center" prop="certificateName" />
      <el-table-column label="证书等级" align="center" prop="certificateLevel" />
      <el-table-column label="有效期" align="center" prop="certificateIndate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.certificateIndate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="会员需求" align="center" prop="memberNeeds" width="120px">
        <template slot-scope="scope">
          <ol style="padding: 5px">
            <li v-for="need in scope.row.memberNeeds" :key="need">{{memberNeeds[need]}}</li>
          </ol>
        </template>
      </el-table-column>
      <!-- <el-table-column label="企业公章" align="center" prop="firm" /> -->
      <el-table-column label="填表人" align="center" prop="people" />
      <el-table-column label="填表日期" align="center" prop="subTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.subTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['research:research:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['research:research:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改主表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="企业名称" prop="firmName">
          <el-input v-model="form.firmName" placeholder="请输入企业名称" />
        </el-form-item>
        <el-form-item label="通讯地址" prop="reAddr">
          <el-input v-model="form.reAddr" placeholder="请输入通讯地址" />
        </el-form-item>
        <el-form-item label="邮编" prop="postcode">
          <el-input v-model="form.postcode" placeholder="请输入邮编" />
        </el-form-item>
        <el-form-item label="负责人" prop="header">
          <el-input v-model="form.header" placeholder="请输入负责人" />
        </el-form-item>
        <el-form-item label="负责人电话" prop="headerPhone">
          <el-input v-model="form.headerPhone" placeholder="请输入负责人电话" />
        </el-form-item>
        <el-form-item label="联络人" prop="liaison">
          <el-input v-model="form.liaison" placeholder="请输入联络人" />
        </el-form-item>
        <el-form-item label="联络人电话" prop="liaisonPhone">
          <el-input v-model="form.liaisonPhone" placeholder="请输入联络人电话" />
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="form.email" placeholder="请输入邮箱" />
        </el-form-item>
        <el-form-item label="微信" prop="wx">
          <el-input v-model="form.wx" placeholder="请输入微信" />
        </el-form-item>
        <el-form-item label="电话" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入电话" />
        </el-form-item>
        <el-form-item label="经营范围" prop="businessScope">
          <el-input v-model="form.businessScope" placeholder="请输入经营范围" />
        </el-form-item>
        <el-form-item label="员工人数" prop="empCount">
          <el-input v-model="form.empCount" placeholder="请输入员工人数" />
        </el-form-item>
        <el-form-item label="中国演出行业协会会员单位" prop="isHyxhhy">
          <el-input v-model="form.isHyxhhy" placeholder="请输入是否是第八届" />
        </el-form-item>
        <el-form-item label="是否是其他学、协会会员" prop="isHyxhhyOther">
          <el-input v-model="form.isHyxhhyOther" placeholder="请输入是否是其他学、协会会员" />
        </el-form-item>
        <el-form-item label="协会名称" prop="hyxhhyOtherName">
          <el-input v-model="form.hyxhhyOtherName" placeholder="请输入协会名称：1、2、3、" />
        </el-form-item>
        <el-form-item label="是否持有中国演出行业协会、演出行业舞美舞台企业专业技术能力等级评价证书" prop="hasCertificate">
          <el-input v-model="form.hasCertificate" placeholder="请输入是否持有中国演出行业协会、演出行业舞美舞台企业专业技术能力等级评价证书" />
        </el-form-item>
        <el-form-item label="证书名称" prop="certificateName">
          <el-input v-model="form.certificateName" placeholder="请输入证书名称" />
        </el-form-item>
        <el-form-item label="证书等级" prop="certificateLevel">
          <el-input v-model="form.certificateLevel" placeholder="请输入证书等级" />
        </el-form-item>
        <el-form-item label="有效期" prop="certificateIndate">
          <el-date-picker clearable
            v-model="form.certificateIndate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择有效期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="会员需求" prop="memberNeed">
          <el-input v-model="form.memberNeed" placeholder="请输入会员需求：提供协会政策及政策解读，参与协会研讨、论坛及交流活动，参与产品推荐会，参加竞赛评比、表彰推广，参加企业联谊会，参加技能培训，企业管理咨询，银行金融服务，法律咨询服务，参与标准编写" />
        </el-form-item>
        <el-form-item label="企业公章" prop="firm">
          <el-input v-model="form.firm" placeholder="请输入企业公章" />
        </el-form-item>
        <el-form-item label="填表人" prop="people">
          <el-input v-model="form.people" placeholder="请输入填表人" />
        </el-form-item>
        <el-form-item label="填表日期" prop="subTime">
          <el-date-picker clearable
            v-model="form.subTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择填表日期">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>

    <!-- 用户导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload
        ref="upload"
        :limit="1"
        accept=".xlsx, .xls"
        :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport"
        :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress"
        :on-success="handleFileSuccess"
        :auto-upload="false"
        drag
      >
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <!-- <div class="el-upload__tip text-center" slot="tip">
          <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的用户数据
          </div>
          <span>仅允许导入xls、xlsx格式文件。</span>
          <el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;" @click="importTemplate">下载模板</el-link>
        </div> -->
      </el-upload>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitFileForm">确 定</el-button>
        <el-button @click="upload.open = false">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listResearch, getResearch, delResearch, addResearch, updateResearch } from "@/api/research/research";
import { getToken } from "@/utils/auth";

export default {
  name: "Research",
  dicts: ['re_yes_no'],
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 主表表格数据
      researchList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        firmName: null,
        reAddr: null,
        postcode: null,
        header: null,
        headerPhone: null,
        liaison: null,
        liaisonPhone: null,
        email: null,
        wx: null,
        phone: null,
        businessScope: null,
        empCount: null,
        firmType: null,
        isHyxhhy: null,
        isHyxhhyOther: null,
        hyxhhyOtherName: null,
        hasCertificate: null,
        certificateName: null,
        certificateLevel: null,
        certificateIndate: null,
        memberNeed: null,
        firm: null,
        people: null,
        subTime: null
      },
      // 表单参数
      form: {},
      // 用户导入参数
      upload: {
        // 是否显示弹出层（用户导入）
        open: false,
        // 弹出层标题（用户导入）
        title: "",
        // 是否禁用上传
        isUploading: false,
        // 是否更新已经存在的用户数据
        updateSupport: 0,
        // 设置上传的请求头部
        headers: { Authorization: "Bearer " + getToken() },
        // 上传的地址
        url: process.env.VUE_APP_BASE_API + "/research/research/importData"
      },
      // 表单校验
      rules: {
      },
      types:['舞美工程','舞台工程','制造生产','其他'],
      memberNeeds:['提供协会政策及政策解读','参与协会研讨','论坛及交流活动','参与产品推荐会','参加竞赛评比','表彰推广','参加企业联谊会','参加技能培训','企业管理咨询','银行金融服务','法律咨询服务','参与标准编写']
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询主表列表 */
    getList() {
      this.loading = true;
      listResearch(this.queryParams).then(response => {
        this.researchList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        firmName: null,
        reAddr: null,
        postcode: null,
        header: null,
        headerPhone: null,
        liaison: null,
        liaisonPhone: null,
        email: null,
        wx: null,
        phone: null,
        businessScope: null,
        empCount: null,
        firmType: null,
        isHyxhhy: null,
        isHyxhhyOther: null,
        hyxhhyOtherName: null,
        hasCertificate: null,
        certificateName: null,
        certificateLevel: null,
        certificateIndate: null,
        memberNeed: null,
        firm: null,
        people: null,
        subTime: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加主表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getResearch(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改主表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateResearch(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addResearch(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除主表编号为"' + ids + '"的数据项？').then(function() {
        return delResearch(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('research/research/export', {
        ...this.queryParams
      }, `research_${new Date().getTime()}.xlsx`)
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "数据导入";
      this.upload.open = true;
    },
    // 提交上传文件
    submitFileForm() {
      this.$refs.upload.submit();
    }
  }
};
</script>
