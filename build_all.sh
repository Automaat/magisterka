pushd cpu-benchmark
./build_and_push_image.sh
popd

pushd file_io_benchmark
./build_and_push_image.sh
popd

pushd network_io_benchmark
./build_and_push_image.sh
popd

pushd load-tests
./build_and_push_image.sh
popd