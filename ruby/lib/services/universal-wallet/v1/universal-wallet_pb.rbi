# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/universal-wallet/v1/universal-wallet.proto
# typed: strict

module Services; end
module Services::Universalwallet; end
module Services::Universalwallet::V1; end

class Services::Universalwallet::V1::SearchRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::SearchRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::SearchRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::SearchRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::SearchRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      query: T.nilable(String),
      continuation_token: T.nilable(String),
      options: T.nilable(Services::Common::V1::RequestOptions)
    ).void
  end
  def initialize(
    query: "",
    continuation_token: "",
    options: nil
  )
  end

  sig { returns(String) }
  def query
  end

  sig { params(value: String).void }
  def query=(value)
  end

  sig { void }
  def clear_query
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
  end

  sig { returns(T.nilable(Services::Common::V1::RequestOptions)) }
  def options
  end

  sig { params(value: T.nilable(Services::Common::V1::RequestOptions)).void }
  def options=(value)
  end

  sig { void }
  def clear_options
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Universalwallet::V1::SearchResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::SearchResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::SearchResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::SearchResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::SearchResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      items: T.nilable(T::Array[T.nilable(Services::Common::V1::JsonPayload)]),
      has_more: T.nilable(T::Boolean),
      count: T.nilable(Integer),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    items: [],
    has_more: false,
    count: 0,
    continuation_token: ""
  )
  end

  sig { returns(T::Array[T.nilable(Services::Common::V1::JsonPayload)]) }
  def items
  end

  sig { params(value: Google::Protobuf::RepeatedField).void }
  def items=(value)
  end

  sig { void }
  def clear_items
  end

  sig { returns(T::Boolean) }
  def has_more
  end

  sig { params(value: T::Boolean).void }
  def has_more=(value)
  end

  sig { void }
  def clear_has_more
  end

  sig { returns(Integer) }
  def count
  end

  sig { params(value: Integer).void }
  def count=(value)
  end

  sig { void }
  def clear_count
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Universalwallet::V1::InsertItemRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::InsertItemRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::InsertItemRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::InsertItemRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::InsertItemRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      item: T.nilable(Services::Common::V1::JsonPayload),
      item_type: T.nilable(String)
    ).void
  end
  def initialize(
    item: nil,
    item_type: ""
  )
  end

  sig { returns(T.nilable(Services::Common::V1::JsonPayload)) }
  def item
  end

  sig { params(value: T.nilable(Services::Common::V1::JsonPayload)).void }
  def item=(value)
  end

  sig { void }
  def clear_item
  end

  sig { returns(String) }
  def item_type
  end

  sig { params(value: String).void }
  def item_type=(value)
  end

  sig { void }
  def clear_item_type
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Universalwallet::V1::InsertItemResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::InsertItemResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::InsertItemResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::InsertItemResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::InsertItemResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer)),
      item_id: T.nilable(String)
    ).void
  end
  def initialize(
    status: :SUCCESS,
    item_id: ""
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { returns(String) }
  def item_id
  end

  sig { params(value: String).void }
  def item_id=(value)
  end

  sig { void }
  def clear_item_id
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Universalwallet::V1::DeleteItemRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::DeleteItemRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::DeleteItemRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::DeleteItemRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::DeleteItemRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      item_id: T.nilable(String)
    ).void
  end
  def initialize(
    item_id: ""
  )
  end

  sig { returns(String) }
  def item_id
  end

  sig { params(value: String).void }
  def item_id=(value)
  end

  sig { void }
  def clear_item_id
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Universalwallet::V1::DeleteItemResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Universalwallet::V1::DeleteItemResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Universalwallet::V1::DeleteItemResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Universalwallet::V1::DeleteItemResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Universalwallet::V1::DeleteItemResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end
