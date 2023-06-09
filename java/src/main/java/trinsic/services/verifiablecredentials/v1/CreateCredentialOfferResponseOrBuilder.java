// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/verifiable-credentials/v1/verifiable-credentials.proto

package trinsic.services.verifiablecredentials.v1;

public interface CreateCredentialOfferResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.verifiablecredentials.v1.CreateCredentialOfferResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The JSON document that contains the credential offer
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The documentJson.
   */
  java.lang.String getDocumentJson();
  /**
   *
   *
   * <pre>
   * The JSON document that contains the credential offer
   * </pre>
   *
   * <code>string document_json = 1;</code>
   *
   * @return The bytes for documentJson.
   */
  com.google.protobuf.ByteString getDocumentJsonBytes();

  /**
   *
   *
   * <pre>
   * If requested, a URL that can be used to share the credential offer with the holder.
   * This is a short URL that can be used in a QR code and will redirect the
   * holder to the credential offer using the wallet app.
   * </pre>
   *
   * <code>string share_url = 2;</code>
   *
   * @return The shareUrl.
   */
  java.lang.String getShareUrl();
  /**
   *
   *
   * <pre>
   * If requested, a URL that can be used to share the credential offer with the holder.
   * This is a short URL that can be used in a QR code and will redirect the
   * holder to the credential offer using the wallet app.
   * </pre>
   *
   * <code>string share_url = 2;</code>
   *
   * @return The bytes for shareUrl.
   */
  com.google.protobuf.ByteString getShareUrlBytes();
}
