package com.kodilla.good.patterns.food2door;

public class ProductDeliveryService {
    private final InformationFoodService informationFoodService;
    private final DeliveryService deliveryService;
    private final DeliveryRepository deliveryRepository;

    public ProductDeliveryService(final InformationFoodService informationFoodService,
                                  final DeliveryService deliveryService,
                                  final DeliveryRepository deliveryRepository) {
        this.informationFoodService = informationFoodService;
        this.deliveryService = deliveryService;
        this.deliveryRepository = deliveryRepository;
    }

    public ExecutionOfContractDto assembly(final DeliveryCompletion deliveryCompletion) {
        DeliveryRequest assemblyDelivery = deliveryCompletion.getDeliveryRequest();

        boolean isCompleted = deliveryService.delivery(deliveryCompletion.getFoodProducer(), assemblyDelivery);

        if (isCompleted) {
            informationFoodService.inform(deliveryCompletion.getFoodProducer(), assemblyDelivery.getBuyer()
                    , assemblyDelivery.getFoodItem());

            deliveryRepository.createDelivery(deliveryCompletion.getFoodProducer()
                    , assemblyDelivery.getBuyer()
                    , assemblyDelivery.getFoodItem()
                    , assemblyDelivery.getOrderDate()
                    , assemblyDelivery.getDeliveryDate());

            return new ExecutionOfContractDto(deliveryCompletion.getFoodProducer()
                    , assemblyDelivery.getBuyer()
                    , assemblyDelivery.getFoodItem()
                    , true);
        } else {
            return new ExecutionOfContractDto(deliveryCompletion.getFoodProducer()
                    , assemblyDelivery.getBuyer()
                    , assemblyDelivery.getFoodItem()
                    , false);
        }
    }
}
