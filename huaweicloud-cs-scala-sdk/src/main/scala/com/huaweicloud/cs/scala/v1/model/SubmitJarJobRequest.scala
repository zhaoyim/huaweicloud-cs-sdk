/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SubmitJarJobRequest (
  /* 作业名称 */
  name: String,
  /* 作业描述 */
  desc: Option[String],
  /* 预留的集群资源ID, 当前用户有该预留资源的使用权限 */
  clusterId: Long,
  /* 用户为作业选择的SPU数量 */
  spuNumber: Option[Int],
  /* log_enabled==true是, 用户授权保存作业日志的OBS路径 */
  obsBucket: Option[String],
  /* 是否开启作业的日志上传到用户的OBS功能 */
  logEnabled: Option[Boolean]
) extends ApiModel


