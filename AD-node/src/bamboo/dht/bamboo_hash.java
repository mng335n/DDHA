/*
 * Automatically generated by jrpcgen 1.0.5 on 7/1/08 11:04 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package bamboo.dht;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class bamboo_hash implements XdrAble {
    public String algorithm;
    public byte [] hash;

    public bamboo_hash() {
    }

    public bamboo_hash(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeString(algorithm);
        xdr.xdrEncodeDynamicOpaque(hash);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        algorithm = xdr.xdrDecodeString();
        hash = xdr.xdrDecodeDynamicOpaque();
    }

}
// End of bamboo_hash.java
