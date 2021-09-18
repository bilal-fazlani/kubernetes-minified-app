import zio.*
import zio.console.*
import com.coralogix.zio.k8s.client.config.httpclient.*
import com.coralogix.zio.k8s.client.config.*
import com.coralogix.zio.k8s.client.v1.configmaps.ConfigMaps
import com.coralogix.zio.k8s.client.v1.pods.Pods

object App extends App {
  val dd = k8sDefault >>> (Pods.live ++ ConfigMaps.live)
  override def run(args:List[String]) = ???
}