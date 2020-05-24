pushd cpu-benchmark
./build_and_push_image.sh
popd

pushd io-benchmark
./build_and_push_image.sh
popd

pushd load-tests
./build_and_push_image.sh
popd